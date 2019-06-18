package us.sqoin.hotpital;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import us.sqoin.hotpital.generators.NotificationGenerator;
import us.sqoin.hotpital.generators.PatientGenerator;
import us.sqoin.hotpital.modal.Notification;
import us.sqoin.hotpital.modal.Patient;

@RestController
public class NotificationWebService {
	
	@GetMapping("/ShowAllNotifs")
	public List<Notification> getAllNotifs () {
	
		return NotificationGenerator.getDefaultNotifications();
	}

}
