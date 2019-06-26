package us.sqoin.hotpital;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import us.sqoin.hotpital.modal.Hotel;

@RestController
public class RestExample {

	@Autowired
	private IHotelService hotelService;
	
	
	@GetMapping("/hotel")
	public List<String> getHotel() {																																														
		
		return hotelService.getName();
	}
	@GetMapping("/getAllHotel")
    public List<Hotel> getAllHotel() {                                                                                                                                                                                        
        
        return hotelService.getAllHotels() ;
    }

}
