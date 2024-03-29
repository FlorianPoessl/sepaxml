package at.poessl.sepaxml.controller;

import at.poessl.sepaxml.schema.sepa.Document;
import at.poessl.sepaxml.service.XmlGenerationService;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.InputStreamSource;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Calendar;



@Controller
public class XmlGenerationController {

	@Autowired
	XmlGenerationService xmlGenerationService;

	@PostMapping("/convert")
	@ResponseBody
	public String handleFileUpload(@RequestParam("excel") MultipartFile excel,
		@RequestParam("accountName") String accountName,
	   	@RequestParam("accountIban") String accountIban,
	   	@RequestParam("accountBic") String accountBic,
	   	@RequestParam("messageId") String messageId,
	   	@RequestParam("creditorId") String creditorId,
		@RequestParam("mandatsId") String mandatsId,
		@RequestParam("mandatsIdLength") int mandatsIdLength,
	   	@RequestParam("bankId") String bankId,
	   	@RequestParam("message") String message, HttpServletResponse response) throws Exception {
		// Save the file to disk or process it in some other way

		try {
			Document xml = xmlGenerationService.generateSepaLastschriftXml(excel.getInputStream(), accountIban, accountBic, message, accountName, messageId, creditorId, mandatsId, mandatsIdLength, bankId);

			Calendar cal = Calendar.getInstance();
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy-HH-mm-ss");
			String filename = "sepa_xml_" + sdf.format(cal.getTime()) + ".xml";

			response.setContentType("application/xml");
			response.setHeader("Content-Disposition", "attachment; filename=" + filename);
			JAXBContext jaxbContext = JAXBContext.newInstance(Document.class);
			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			marshaller.marshal(xml, response.getOutputStream());
			return "";
		} catch(Exception ex) {
			return ex.getMessage();
			//throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Something went wrong", ex);
		}

	}

}
