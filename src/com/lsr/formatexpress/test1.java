package com.lsr.formatexpress;

import java.io.IOException;
import java.util.Properties;

public class test1 {
	public static void main(String[] args){
		
		try {
			//Runtime.getRuntime().exec("cmd /c \"E:\\志高项目\\拓邦PLM项目二次开发说明书 V1.3.doc\"");
			//Runtime.getRuntime().exec("E:\\志高项目\\拓邦PLM项目二次开发说明书 V1.3.doc");
			
			Properties properties = System.getProperties();
	        String osName = properties.getProperty("os.name");
	         
	        System.out.println (osName);
	         
	        if (osName.indexOf("Linux") != -1) {
	            Runtime.getRuntime().exec("htmlview");
	        } else if (osName.indexOf("Windows") != -1){
	            Runtime.getRuntime().exec("explorer http://www.163.com");
	        } else {
	            throw new RuntimeException("Unknown OS.");
	        }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
}
