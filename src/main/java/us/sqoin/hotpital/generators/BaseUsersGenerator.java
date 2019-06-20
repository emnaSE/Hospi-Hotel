package us.sqoin.hotpital.generators;


import java.util.Arrays;
import java.util.List;

import us.sqoin.hotpital.modal.BaseUser;


public class BaseUsersGenerator {
	
	private static BaseUser user1;
	private static BaseUser user2;
	private static BaseUser user3;
	private static BaseUser user4;
	private static BaseUser user5;
	private static BaseUser user6;

	
	static {
		user1 = new BaseUser(2l, "Zarrouk", "1234", "M",0);
		user2 = new BaseUser(3l, "Hôtel Boulevard Saint-Jacques", "12", "H",0);
		user3 = new BaseUser(3l, "Ben Abdallah", "azerty", "P",0);
		user4 = new BaseUser(4l, "Ben mohamed", "Tun12", "P",0);
		user5 = new BaseUser(5l, "karray", "Tun12", "M",0);
		user6 = new BaseUser(6l, "Foulen", "azerty1234", "p",0);

	}

	public static List<BaseUser> getDefaultUsers() {
		return Arrays.asList(user1,user2,user3,user4,user5,user6);
	}

	public static BaseUser getUser1() {
		return user1;
	}

	public static void setUser1(BaseUser user1) {
		BaseUsersGenerator.user1 = user1;
	}

	public static BaseUser getUser5() {
		return user5;
	}

	public static void setUser5(BaseUser user5) {
		BaseUsersGenerator.user5 = user5;
	}
	
	

}
