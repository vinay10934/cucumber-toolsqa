package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.testng.annotations.Test;

public class Testutility {
	public Properties prop;
	
	@Test
	public void Sendemail() throws IOException {
		prop = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\vinay\\eclipse-workspace\\Facebook\\src\\main\\java\\utility\\Email.properties");
		prop.load(file);
		prop.put("mail.smtp.host", "smtp.gmail.com");
		// set the port of socket factory
		prop.put("mail.smtp.socketFactory.port", "465");
		// set socket factory
		prop.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		prop.put("mail.smtp.auth", "true");
		// set the port of SMTP server
		prop.put("mail.smtp.port", "465");

		// This will handle the complete authentication
		Session session = Session.getDefaultInstance(prop,new javax.mail.Authenticator() {

					protected PasswordAuthentication getPasswordAuthentication() {

						return new PasswordAuthentication(prop.getProperty("email"), prop.getProperty("password"));
						//return new PasswordAuthentication("vinay10934@gmail.com", "9334239913");

					}

				});

		try
		{
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(prop.getProperty("email")));
			message.setRecipients(Message.RecipientType.TO,InternetAddress.parse("vinay1093@gmail.com"));
			message.setSubject("Testing From Selenium");
			
			// Create object to add multimedia type content
			BodyPart messageBodyPart1 = new MimeBodyPart();
			
			// Set the body of email
			messageBodyPart1.setText("HEllo friends,I have started package");
			
			// Create object of MimeMultipart class
						Multipart multipart = new MimeMultipart();

						// add body part 2
						multipart.addBodyPart(messageBodyPart1);

						// set the content
						message.setContent(multipart);

			
			Transport.send(message);
			 
			System.out.println("=====Email Sent=====");
			
		}catch(MessagingException e)
		{
			throw new RuntimeException(e);
		}
	}
}
