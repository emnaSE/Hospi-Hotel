package us.sqoin.hotpital;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;

import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.mail.Authenticator;
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
import javax.servlet.ServletContext;


import us.sqoin.hotpital.generators.ContentIdGenerator;

public class MailWebService {

	/*
	 * static ServletContext context; public static String contacterNous() throws
	 * MessagingException, IOException, InterruptedException {
	 * 
	 * Gson gson = new Gson(); String subject = "Nouveau message"; Properties
	 * properties = new Properties(); properties.put("mail.smtp.host",
	 * "mail.privateemail.com"); //properties.put("mail.smtp.starttls.enable",
	 * "true");
	 * 
	 * properties.put("mail.smtp.port", "465"); properties.put("mail.smtp.auth",
	 * "true"); properties.put("mail.smtp.ssl.trust", "mail.privateemail.com");
	 * properties.put("mail.smtp.user", "admin@sqoin.us");
	 * properties.put("mail.smtp.socketFactory.port", "465");
	 * properties.put("mail.smtp.socketFactory.class",
	 * "javax.net.ssl.SSLSocketFactory");
	 * properties.put("mail.smtp.socketFactory.fallback", "false"); Authenticator
	 * auth = new SMTPAuthenticator(); Session session =
	 * Session.getInstance(properties, auth); Transport transport =
	 * session.getTransport("smtp"); Integer p = 465; String host =
	 * "mail.privateemail.com"; String userName = "admin@sqoin.us"; String password
	 * = "24a4BsE2xYDdq88CVRbJ"; transport.connect(host, p, userName, password);
	 * Message msg = new MimeMessage(session); msg.setFrom(new
	 * InternetAddress(userName)); InternetAddress[] toAddresses = { new
	 * InternetAddress("dalialaya4@gmail.com") };//you mail here
	 * msg.setRecipients(Message.RecipientType.TO, toAddresses);
	 * msg.setSubject(subject); msg.setSentDate(new Date());
	 * msg.addHeader("Content-type", "text/HTML; charset=UTF-8");
	 * msg.addHeader("format", "flowed"); msg.addHeader("Content-Transfer-Encoding",
	 * "8bit"); MimeMultipart content = new MimeMultipart("related"); String cid =
	 * ContentIdGenerator.getContentId(); MimeBodyPart textPart2 = new
	 * MimeBodyPart(); msg.setContent(content); textPart2.
	 * setText("<html><body><div><span style=\"color:#000000; font-size:12px\"><b>Bonjour,</b></span> "
	 * + "\" />" + "</div>\n" + "" + "</body></html>", "US-ASCII", "html");
	 * content.addBodyPart(textPart2); msg.setContent(content);
	 * 
	 * 
	 * 
	 * 
	 * Boolean sent = false; int i = 5; int time = 60000; while (!sent && i > 1) {
	 * 
	 * try { System.out.println("sending email.."); Transport.send(msg);
	 * System.out.println("Email Sent Successfully!!"); sent = true; } catch
	 * (Exception e) { Thread.sleep(time);// assuming it takes 1 min to complete the
	 * // task i--; switch (i) { case 2: time = 600000;// 10 min break; case 3: time
	 * = 300000;// 5 min break; case 4: time = 120000;// 2 min break; default: time
	 * = 60000;// 1 min break; } e.printStackTrace(); } } transport.close(); return
	 * "ok!";
	 * 
	 * }
	 * 
	 * public static void main(String[] args) throws MessagingException,
	 * IOException, InterruptedException { contacterNous(); }
	 */
	
	
}




