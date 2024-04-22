package qsp;

import java.util.ArrayList;
import java.util.HashMap;

public class DataDrivenTesting {

	public static void main(String[] args) {
		/*ArrayList<String> al=new ArrayList<>();
		al.add("http://localhost/login.do");
		al.add("admin");
		al.add("admin@actitime.com");
		al.add("manager");
		System.out.println(al.get(3));*/

		HashMap<String, String> hm=new HashMap<String, String>();
		hm.put("url", "http://localhost/login.do");
		hm.put("un", "admin");
		hm.put("mailid", "admin@actitime.com");
		hm.put("pw", "manager");
		System.out.println(hm.get("pw"));
	}

}
