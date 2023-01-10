package at.poessl.sepaxml.service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.UUID;

import at.poessl.sepaxml.schema.sepa.*;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

@Component("xmlGenerationService")
public class XmlGenerationServiceImpl implements XmlGenerationService {

	@Override
	public File generateSepaLastschriftXml(InputStream inputcsv, String accountIban, String accountBic, String message, String accountName, String messageId, String creditorId, String bankId) {
		try {
			List<String> userList = readCsv(inputcsv);

			Document document = new Document();
			Pain00800101 pain00800101 = new Pain00800101();
			GroupHeader1 groupHeader1 = new GroupHeader1();

			// ID
			groupHeader1.setMsgId(messageId + getId());

			// Datum
			GregorianCalendar c = new GregorianCalendar();
			Calendar cal = Calendar.getInstance();
			c.setTime(cal.getTime());
			XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);

			groupHeader1.setCreDtTm(date2);

			groupHeader1.setCtrlSum(BigDecimal.ZERO);
			groupHeader1.setNbOfTxs(String.valueOf(userList.size()));
			groupHeader1.setGrpg(Grouping1Code.MIXD);

			// InitgPty
			PartyIdentification8 partyIdentification8 = new PartyIdentification8();
			partyIdentification8.setNm(accountName);

			Party2Choice party2Choice = new Party2Choice();
			OrganisationIdentification2 organisationIdentification2 = new OrganisationIdentification2();
			organisationIdentification2.setBkPtyId(bankId);
			party2Choice.setOrgId(organisationIdentification2);

			partyIdentification8.setId(party2Choice);

			groupHeader1.setInitgPty(partyIdentification8);

			BigDecimal sum = BigDecimal.ZERO;

			for (String line : userList) {
				line = cleanTextContent(line);
				String[] user = line.split(";");
				String mandatsId = user[0];
				String name = user[1];
				String iban = user[2];
				String fea = user[3];
				String bic = user[4];

				BigDecimal value = new BigDecimal(fea);
				sum = sum.add(value);

				// PaymentInformation
				PaymentInstructionInformation2 paymentInstructionInformation2 = new PaymentInstructionInformation2();
				paymentInstructionInformation2.setPmtInfId(mandatsId + getId());
				paymentInstructionInformation2.setPmtMtd(PaymentMethod2Code.DD);

				PaymentTypeInformation2 paymentTypeInformation2 = new PaymentTypeInformation2();
				ServiceLevel3Choice serviceLevel3Choice = new ServiceLevel3Choice();
				serviceLevel3Choice.setCd(ServiceLevel2Code.SEPA);

				LocalInstrument1Choice localInstrument1Choice = new LocalInstrument1Choice();
				localInstrument1Choice.setCd("CORE");

				// Payment Type Information
				paymentTypeInformation2.setSvcLvl(serviceLevel3Choice);
				paymentTypeInformation2.setLclInstrm(localInstrument1Choice);
				paymentTypeInformation2.setSeqTp(SequenceType1Code.OOFF);
				paymentInstructionInformation2.setPmtTpInf(paymentTypeInformation2);

				paymentInstructionInformation2.setReqdColltnDt(date2);

				PartyIdentification8 partyIdentification81 = new PartyIdentification8();
				partyIdentification81.setNm(accountName);
				paymentInstructionInformation2.setCdtr(partyIdentification81);

				CashAccount7 cashAccount7 = new CashAccount7();
				AccountIdentification3Choice accountIdentification3Choice = new AccountIdentification3Choice();
				accountIdentification3Choice.setIBAN(accountIban);
				cashAccount7.setId(accountIdentification3Choice);
				paymentInstructionInformation2.setCdtrAcct(cashAccount7);

				BranchAndFinancialInstitutionIdentification3 branchAndFinancialInstitutionIdentification3 = new BranchAndFinancialInstitutionIdentification3();
				FinancialInstitutionIdentification5Choice financialInstitutionIdentification5Choice = new FinancialInstitutionIdentification5Choice();
				financialInstitutionIdentification5Choice.setBIC(accountBic);
				branchAndFinancialInstitutionIdentification3.setFinInstnId(financialInstitutionIdentification5Choice);
				paymentInstructionInformation2.setCdtrAgt(branchAndFinancialInstitutionIdentification3);

				DirectDebitTransactionInformation1 directDebitTransactionInformation1 = new DirectDebitTransactionInformation1();
				PaymentIdentification1 paymentIdentification1 = new PaymentIdentification1();
				paymentIdentification1.setEndToEndId("NOTPROVIDED");
				directDebitTransactionInformation1.setPmtId(paymentIdentification1);

				CurrencyAndAmount currencyAndAmount = new CurrencyAndAmount();
				currencyAndAmount.setCcy("EUR");
				currencyAndAmount.setValue(value);

				DirectDebitTransaction1 directDebitTransaction1 = new DirectDebitTransaction1();
				MandateRelatedInformation1 mandateRelatedInformation1 = new MandateRelatedInformation1();
				mandateRelatedInformation1.setMndtId(mandatsId);
				mandateRelatedInformation1.setDtOfSgntr(date2);
				directDebitTransaction1.setMndtRltdInf(mandateRelatedInformation1);

				PartyIdentification8 partyIdentification82 = new PartyIdentification8();
				Party2Choice party2Choice1 = new Party2Choice();
				PersonIdentification3 personIdentification3 = new PersonIdentification3();
				GenericIdentification4 genericIdentification4 = new GenericIdentification4();
				genericIdentification4.setId(creditorId);
				genericIdentification4.setIdTp("SEPA");
				personIdentification3.setOthrId(genericIdentification4);
				party2Choice1.getPrvtId().add(personIdentification3);
				partyIdentification82.setId(party2Choice1);

				directDebitTransaction1.setCdtrSchmeId(partyIdentification82);

				directDebitTransactionInformation1.setDrctDbtTx(directDebitTransaction1);

				BranchAndFinancialInstitutionIdentification3 branchAndFinancialInstitutionIdentification31 = new BranchAndFinancialInstitutionIdentification3();
				FinancialInstitutionIdentification5Choice financialInstitutionIdentification5Choice1 = new FinancialInstitutionIdentification5Choice();
				financialInstitutionIdentification5Choice1.setBIC(bic);
				branchAndFinancialInstitutionIdentification31.setFinInstnId(financialInstitutionIdentification5Choice1);
				directDebitTransactionInformation1.setDbtrAgt(branchAndFinancialInstitutionIdentification31);

				PartyIdentification8 partyIdentification83 = new PartyIdentification8();
				partyIdentification83.setNm(name);
				directDebitTransactionInformation1.setDbtr(partyIdentification83);

				CashAccount7 cashAccount71 = new CashAccount7();
				AccountIdentification3Choice accountIdentification3Choice1 = new AccountIdentification3Choice();
				accountIdentification3Choice1.setIBAN(iban);
				cashAccount71.setId(accountIdentification3Choice1);
				directDebitTransactionInformation1.setDbtrAcct(cashAccount71);

				RemittanceInformation1 remittanceInformation1 = new RemittanceInformation1();
				remittanceInformation1.getUstrd().add(message);
				directDebitTransactionInformation1.setRmtInf(remittanceInformation1);

				directDebitTransactionInformation1.setInstdAmt(currencyAndAmount);

				paymentInstructionInformation2.getDrctDbtTxInf().add(directDebitTransactionInformation1);

				pain00800101.getPmtInf().add(paymentInstructionInformation2);
			}

			groupHeader1.setCtrlSum(sum);

			pain00800101.setGrpHdr(groupHeader1);
			document.setPain00800101(pain00800101);

			return jaxbObjectToXML(document);
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	private File jaxbObjectToXML(Document document)
	{
		System.out.println("Generating XML");
		try
		{
			//Create JAXB Context
			JAXBContext jaxbContext = JAXBContext.newInstance(Document.class);

			//Create Marshaller
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

			//Required formatting??
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

			ClassLoader classLoader = getClass().getClassLoader();
			//Store XML to File
			File folder = new File(classLoader.getResource(".").getFile(), "xmls");
			//folder = new File("C:\\Data");

			Calendar cal = Calendar.getInstance();
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy-HH-mm-ss");
			String filename = "sepa_xml_" + sdf.format(cal.getTime() )+ ".xml";

			File file = new File(folder, filename);
			System.out.println(file.getAbsolutePath());
			try {
				file.createNewFile();

				//Writes XML file to file-system
				jaxbMarshaller.marshal(document, file);
				System.out.println("XML successfully generated");
				return file;
			} catch(IOException ex) {
				System.out.println(ex.getStackTrace());
				return null;
			}
		}
		catch (JAXBException e)
		{
			System.out.println(e.getStackTrace());
		}
		return null;
	}

	private List<String> readCsv(InputStream input) {
		System.out.println("Reading CSV");
		List<String> lines = new ArrayList<>();
		String line = "";
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(input));
			while ((line = br.readLine()) != null)   //returns a Boolean value
			{
				lines.add(line);
				System.out.println(line);
			}
		}
		catch (IOException e)
		{
			System.out.println(e.getStackTrace());
		}
		return lines;
	}

	private static String getId() {
		String uniqueID = UUID.randomUUID().toString();
		String trimmed  = uniqueID.substring(0, 10);
		return trimmed;
	}

	private String cleanTextContent(String text)
	{
		System.out.println("Cleaning Text Content");
		// strips off all non-ASCII characters
		text = text.replaceAll("[^\\x00-\\x7F]", "");

		// erases all the ASCII control characters
		text = text.replaceAll("[\\p{Cntrl}&&[^\r\n\t]]", "");

		// removes non-printable characters from Unicode
		text = text.replaceAll("\\p{C}", "");

		return text;
	}
}
