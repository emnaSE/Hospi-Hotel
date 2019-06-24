package us.sqoin.hotpital;

import java.util.List;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import us.sqoin.hotpital.generators.HotelGenerator;
import us.sqoin.hotpital.generators.BaseUsersGenerator;
import us.sqoin.hotpital.modal.Hotel;
import us.sqoin.hotpital.modal.Mail;
import us.sqoin.hotpital.modal.Reservation;
import us.sqoin.hotpital.modal.BaseUser;


@RestController

public class BaseUserWebService {
	
	@GetMapping("/getUser")
     public List<BaseUser> getUsers() {	
		return BaseUsersGenerator.getDefaultUsers();

	}

	 @Autowired
	    private JavaMailSender javaMailSender;

	   

	   public  void sendEmail() {

	        SimpleMailMessage msg = new SimpleMailMessage();
	        msg.setTo("Mohamedali.benalaya@esprit.tn");

	        msg.setSubject("in Our project it's fine");
	        msg.setText("Hello Worldsssssss \n Spring Boot Email");

	        javaMailSender.send(msg);

	    }

	@GetMapping("/Check")
	
    public BaseUser Login(String username,String password) throws MessagingException {
		List<BaseUser> arf = getUsers();

	
	
	
		BaseUser r=null;
		for (BaseUser s : arf) {
			if(s.getUsername().equals(username) && s.getPassword().equals(password) )
			{
				
				r=s;
				s.setStateLog(1);
		
			 
			}
		}
	//	sendEmail();
	
		return r;
	
		

	}

}
