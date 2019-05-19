package com.example.rentpig.e_mail;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Sendmail extends Thread {
	private String from="840459919@qq.com";
	private String username="840459919";
	private String password="ddzxjqujfgkjbcej";
	private String host="smtp.qq.com";
	private String to="收件人";
	private int validateCode=0;
	public Sendmail(String to,int validateCode) {
		this.to=to;
		this.validateCode=validateCode;
	}
	
	@Override
	public void run() {
		Properties properties =new Properties();
		properties.setProperty("mail.host", host);
		properties.setProperty("mail.transport.protocol", "smtp");
		properties.setProperty("mail.smtp.auth", "true");
		properties.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		properties.setProperty("mail.smtp.port", "465");
        properties.setProperty("mail.smtp.socketFactory.port", "465");
        Session session=Session.getInstance(properties);
        session.setDebug(true);
        try {
			Transport transport=session.getTransport();
			transport.connect(host, username, password);
			Message message = createSimpleMail(session);
			transport.sendMessage(message, message.getAllRecipients());
			transport.close();
		} catch (MessagingException | IOException e) {
			
			e.printStackTrace();
		}
	}
	
	private Message createSimpleMail(Session session) throws MessagingException, FileNotFoundException, IOException {
	   //创建邮件
       MimeMessage message = new MimeMessage(session); 
       //设置邮件的基本信息
       message.setFrom(new InternetAddress(from));
       message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
       message.setSubject("验证码");
       //正文
       String text="您的邮箱验证码为："+validateCode;
       message.setContent(text, "text/html;charset=UTF-8");
       message.saveChanges();
       //返回创建好的的邮件
       return message;
	}
}
