package com.hand;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JOptionPane;

public class TransClient extends Thread {
	
	private Socket s;

	public TransClient(String ip,int port) {
		try {
			s = new Socket(ip, port);
			System.out.println("成功连上服务端");
		} catch (UnknownHostException e1) {
			e1.printStackTrace();
			
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
@Override
public void run() {
	try {
		InputStream fis = s.getInputStream();
		File f = new File("1.pdf");
		FileOutputStream fos = new FileOutputStream(f);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		 byte[] buff = new byte[4];
		 int n = 0;
		 
		 while((n=fis.read(buff))!=-1){
				bos.write(buff);
				bos.flush();
			}
		 
		 bos.close();
		 fos.close();
		 fis.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
		
}
}
