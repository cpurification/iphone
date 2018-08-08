package siri;

import java.awt.Desktop;

import java.net.*;

public class WebPage {

	public static void main(String[] args) throws Exception {
		
		web();
	}
	
	public static void web() throws Exception {
		
		Desktop d = Desktop.getDesktop();
		
		try {
			d.browse(new URI("http://google.com"));
		}
		catch(Exception e) {
			System.out.println("not match");
		}
	}
}
