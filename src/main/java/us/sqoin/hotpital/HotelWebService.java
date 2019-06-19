package us.sqoin.hotpital;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import us.sqoin.hotpital.generators.HotelGenerator;
import us.sqoin.hotpital.modal.Hotel;

@RestController
public class HotelWebService {
	
	@GetMapping("/getHotels")
	public List<Hotel> getHotel() {	
		return HotelGenerator.getDefaultsHotels();

	}	

}
