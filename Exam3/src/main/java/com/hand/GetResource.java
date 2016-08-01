package com.hand;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class GetResource {
	String urlStr ;
	URL url;
    InputStream is;
    BufferedReader br;
    
	public GetResource(String urlStr) {
		this.urlStr = urlStr;
		
	}
	
	public String getResources() {
		StringBuffer sb = new StringBuffer();
		try {
			url = new URL(urlStr);
			URLConnection connection = url.openConnection(); 
			is =connection.getInputStream();
			br = new BufferedReader(new InputStreamReader(is, "GBK"));
			
			String str;
			while((str=br.readLine())!=null){		
				sb.append(str);
			}
			
			br.close();
			is.close();
						
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return sb.toString();
	}

	
}
