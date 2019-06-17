package us.sqoin.hotpital.modal;

import java.io.Serializable;



public class BaseUser implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;
	private String Username;
	private String Password;
	private String Role;
	private int StateLog;
	
	
	public BaseUser() {
		
	}

	public BaseUser(Long id, String username, String password, String role,int StateLog) {
		super();
		this.id = id;
		Username = username;
		Password = password;
		Role = role;
		this.StateLog=StateLog;
	}


	public BaseUser(Long id2) {
		this.id=id2;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return Username;
	}


	public void setUsername(String username) {
		Username = username;
	}


	public String getPassword() {
		return Password;
	}


	public void setPassword(String password) {
		Password = password;
	}


	public String getRole() {
		return Role;
	}


	public void setRole(String role) {
		Role = role;
	}
	

	public int getStateLog() {
		return StateLog;
	}

	public void setStateLog(int stateLog) {
		StateLog = stateLog;
	}

	@Override
	public String toString() {
		return "BaseUser [id=" + id + ", Username=" + Username + ", Password=" + Password + ", Role=" + Role
				+ ", StateLog=" + StateLog + "]";
	}

	
	
	

	


}
