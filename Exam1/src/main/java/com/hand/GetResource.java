package com.hand;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class GetResource {
	 String urlStr ;
	 URL url;
	 InputStream is;
	 FileOutputStream fos;
	 BufferedInputStream bis;
	 BufferedOutputStream bos;

	public GetResource(String urlStr) {
		this.urlStr = urlStr;
		try {
			url = new URL(urlStr);
			URLConnection connection = url.openConnection(); 
			 is =connection.getInputStream();
			 bis = new BufferedInputStream(is);
			
			
			 File f = new File("exam1.pdf");

			 fos = new FileOutputStream(f);
			 bos = new BufferedOutputStream(fos);
			 
			 byte[] buff = new byte[4];
			 int n = 0;
			 
			 while((n=bis.read(buff))!=-1){
					bos.write(buff);
					bos.flush();
				}
			 
			 bos.close();
			 fos.close();
			 bis.close();
			 is.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
