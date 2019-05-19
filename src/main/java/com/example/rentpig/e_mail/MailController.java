package com.example.rentpig.e_mail;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {
	
	@RequestMapping("/sendmail")
	public void sendmail(String tomail,String num) {
		Sendmail sendmail =new Sendmail(tomail, Integer.parseInt(num));
		sendmail.start();
	}
}
