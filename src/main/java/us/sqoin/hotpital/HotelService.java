package us.sqoin.hotpital;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import us.sqoin.hotpital.modal.Hotel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.SingleColumnRowMapper;
import org.springframework.stereotype.Component;

@Component
public class HotelService implements IHotelService{
	
	 @Autowired
	 private JdbcTemplate template;
	    
	
	 public static RowMapper<Hotel> hotelMapper = new RowMapper<Hotel>() {

	        @Override
	        public Hotel mapRow(ResultSet row, int index) throws SQLException {
	            Hotel hotel = new Hotel();
	            hotel.setId(row.getLong("id"));
	            hotel.setName(row.getString("name"));
	            hotel.setLatitude(row.getDouble("latitude"));
	            hotel.setLongitude(row.getDouble("longitude"));
	            hotel.setRating(row.getInt("rating"));
	            hotel.setBeds(row.getInt("beds"));
	            return hotel;
	        }      
	 };
@Override
	    public List<Hotel> getAllHotels() {
	        return template.query("select * from hotel", hotelMapper);
	    }     
	 

	@Override
	public List<String> getName () {
	
	System.out.println("I'm here");
	 return template.query("select name from hotel",SingleColumnRowMapper.newInstance(String.class));
	}

	
	
	
	



	 }