package siri;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;

public class OpenWebsite {

	public static void main(String[] args)  {
		
		wSite();
   }
	
	public static void wSite() {
		try {
			System.out.println("Which website?: ");
			Scanner input = new Scanner(System.in);
			
			String msg = input.nextLine();
			
			URI uri= new URI("www."+msg+".com");
			java.awt.Desktop.getDesktop().browse(uri);
			
			
			System.out.println(msg + "opened in browser");

		} catch (Exception e) {
			e.printStackTrace();
      }
	}
}