package at.poessl.sepaxml.controller;

import at.poessl.sepaxml.service.XmlGenerationService;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.InputStreamSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;

@Controller
public class XmlGenerationController {

	@Autowired
	XmlGenerationService xmlGenerationService;

	@PostMapping("/convert")
	@ResponseBody
	public void handleFileUpload(@RequestParam("csv") MultipartFile csv,
		@RequestParam("accountName") String accountName,
	   	@RequestParam("accountIban") String accountIban,
	   	@RequestParam("accountBic") String accountBic,
	   	@RequestParam("messageId") String messageId,
	   	@RequestParam("creditorId") String creditorId,
	   	@RequestParam("bankId") String bankId,
	   	@RequestParam("message") String message, HttpServletResponse response) throws IOException {
		// Save the file to disk or process it in some other way

		File xml = xmlGenerationService.generateSepaLastschriftXml(csv.getInputStream(), accountIban, accountBic, message, accountName, messageId, creditorId, bankId);

		if (xml == null) return;

		InputStream inputStream = new FileInputStream(xml);

		String mimeType = URLConnection.guessContentTypeFromStream(inputStream);
		if (mimeType == null) {
			mimeType = "application/octet-stream";
		}

		response.setContentType(mimeType);
		response.setHeader("Content-Disposition", String.format("inline; filename=\"" + xml.getName() + "\""));
		response.setContentLength((int) xml.length());

		InputStreamSource inputStreamSource = new InputStreamResource(inputStream);
		IOUtils.copy(inputStreamSource.getInputStream(), response.getOutputStream());
		response.flushBuffer();

		//return "redirect:/success";
	}

}
