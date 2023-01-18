package at.poessl.sepaxml.service;

import at.poessl.sepaxml.schema.sepa.Document;
import org.springframework.context.annotation.Bean;

import java.io.File;
import java.io.InputStream;

public interface XmlGenerationService {

	Document generateSepaLastschriftXml(InputStream inputexcel, String accountIban, String accountBic, String message, String accountName, String messageId, String creditorId, String mandatsId, int mandatsIdLength, String bankId);

}
