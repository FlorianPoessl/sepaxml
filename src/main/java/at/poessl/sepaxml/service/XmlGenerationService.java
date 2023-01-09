package at.poessl.sepaxml.service;

import org.springframework.context.annotation.Bean;

import java.io.File;
import java.io.InputStream;

public interface XmlGenerationService {

	File generateSepaLastschriftXml(InputStream inputcsv, String accountIban, String accountBic, String message, String accountName, String messageId, String creditorId, String bankId);

}
