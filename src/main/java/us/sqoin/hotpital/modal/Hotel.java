package us.sqoin.hotpital.modal;

import java.io.Serializable;

public class Hotel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private double latitude;
	private double longitude;
	private int rating;
	private int beds;
    
	
	
	
	
	public Hotel(Long id, String name, double latitude, double longitude, int rating, int beds, Long idM) {
		super();
		this.id = id;
		this.name = name;
		this.latitude = latitude;
		this.longitude = longitude;
		this.rating = rating;
		this.beds = beds;
	}
	public Hotel(Long id, String name, double latitude, double longitude, int rating, int beds) {
		super();
		this.id = id;
		this.name = name;
		this.latitude = latitude;
		this.longitude = longitude;
		this.rating = rating;
		this.beds = beds;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public int getBeds() {
		return beds;
	}
	public void setBeds(int beds) {
		this.beds = beds;
	}

	
	
	@Override
	public String toString() {
		return "Hotel [id=" + id + ", name=" + name + ", latitude=" + latitude + ", longitude=" + longitude
				+ ", rating=" + rating + ", beds=" + beds +  "]";
	}
	
	
	
	


}
