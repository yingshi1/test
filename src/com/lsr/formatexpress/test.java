package com.lsr.formatexpress;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;


public class test {
	public static void main(String[] args) {
		URL url;
		try {
			url = new URL("http://www.baidu.com");
			Reader reader = new InputStreamReader(new BufferedInputStream(url.openStream()),"UTF-8");
			int c;
			ArrayList<Object> list1 = new ArrayList<Object>();
			while((c=reader.read())!=-1){
				System.out.print((char) c);
				System.out.print((char) c);
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
