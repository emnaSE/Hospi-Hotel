package us.sqoin.hotpital;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import us.sqoin.hotpital.generators.HotelGenerator;
import us.sqoin.hotpital.generators.BaseUsersGenerator;
import us.sqoin.hotpital.modal.Hotel;
import us.sqoin.hotpital.modal.BaseUser;

@RestController
public class BaseUserWebService {
	
	@GetMapping("/getUser")
     public List<BaseUser> getUsers() {	
		return BaseUsersGenerator.getDefaultUsers();

	}
	
	@GetMapping("/Check")
    public BaseUser Login(String username,String password) {
		List<BaseUser> arf = getUsers();
		BaseUser r=null;
		for (BaseUser s : arf) {
			if(s.getUsername().equals(username) && s.getPassword().equals(password) )
			{
				
				r=s;
				s.setStateLog(1);
				System.out.println("Connected"+r);
				if(s.getRole().equals("M"))
				{
					System.out.print("Medecin");
					
				}
				else if (s.getRole().equals("P"))
				{
					System.out.print("Patient");
				}
				else if(s.getRole().equals("H"))
				{
					System.out.print("Hotel");
				}
				else
				{
					System.out.print("Unknown");

				}
			 return r;
			 
			}
		}
		System.out.print("Not Connected");
		return r;
	
		

	}

}
