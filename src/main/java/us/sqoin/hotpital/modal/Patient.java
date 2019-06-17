package us.sqoin.hotpital.modal;

import java.io.Serializable;
import java.util.Date;

public class Patient  extends BaseUser   implements Serializable   {
	
	
	private static final long serialVersionUID = 1L;

	
	private Long idM;
	private String FirstName;
	private String LastName;
	private String Address;
	private Long phone;
	private Date birthday;
	
	public Patient() {
		
	}
	public Patient(Long idM)
	{
		this.idM=idM;
	}
	public Patient(String firstName, String lastName, String address, Long phone, Date birthday) {
		super();
		FirstName = firstName;
		LastName = lastName;
		Address = address;
		this.phone = phone;
		this.birthday = birthday;
	}
	
	
	public Patient(Long idM, String firstName, String lastName, String address, Long phone, Date birthday) {
		super();
		this.idM = idM;
		FirstName = firstName;
		LastName = lastName;
		Address = address;
		this.phone = phone;
		this.birthday = birthday;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	@Override
	public String toString() {
		return "Patient [idM=" + idM + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Address=" + Address
				+ ", phone=" + phone + ", birthday=" + birthday + "]";
	}
	
	
	
	
	
	
	

}
