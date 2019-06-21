package us.sqoin.hotpital.generators;

import java.net.UnknownHostException;
import java.util.Random;

public class ContentIdGenerator {

	static int seq = 0;
	  static String hostname;
	  
	  static {
	    try {
	      hostname = java.net.InetAddress.getLocalHost().getCanonicalHostName();
	    } catch (UnknownHostException e) {
	      hostname = new Random(System.currentTimeMillis()).nextInt(100000) + ".localhost";
	    }
	  }
	  
	 
	  public static synchronized int getSeq() {
	    return (seq++) % 100000;
	  }
	  
	 
	  public static String getContentId() {
	    int c = getSeq();
	    return c + "." + System.currentTimeMillis() + "@" + hostname;
	  }

	
}
