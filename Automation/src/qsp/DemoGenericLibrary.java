package qsp;

import java.io.IOException;

public class DemoGenericLibrary {

	public static void main(String[] args) throws IOException {
		FileLib f =new FileLib();
		System.out.println(f.getPropertyData("url"));
		String un = (f.getPropertyData("username"));
		String pw = (f.getPropertyData("password"));
		System.out.println(un);
		System.out.println(pw);
		String cn = f.getExcelData("Sheet1", 1, 2);
        System.out.println(cn);
        f.setExcelData("Sheet1", 1, 4, "pass or fail");
	}

}
