package com.hand;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.Socket;


public class TransServer extends Thread {
	 Socket socket;
		
     public TransServer(Socket s) {
		this.socket=s;
	}
     
     @Override
   public void run() {
    	 File f = new File("exam1.pdf");
		 FileInputStream fis;
		try {
			fis = new FileInputStream(f);
			BufferedInputStream bis = new BufferedInputStream(fis);
			
			 byte[] buff = new byte[4];
			 int n = 0;
			 
			 try {
				while((n=bis.read(buff))!=-1){
					    socket.getOutputStream().write(buff);
					    try {
							socket.getOutputStream().flush();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
			} catch (IOException e) {
				e.printStackTrace();
			}
		  	
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		 
   }
		
}


