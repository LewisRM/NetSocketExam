package com.hand;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JOptionPane;





public class MyServer extends Thread {
	public void run() {
	      try {
			ServerSocket serversocket= new ServerSocket(12345);
			while(true){
				 Socket socket= serversocket.accept();
				 JOptionPane.showMessageDialog(null, "有客户端连接到了12345端口");
				
				 TransServer ts= new TransServer(socket);
				 ts.start();				 				 
			}
		   
		    
		} catch (IOException e) {
			e.printStackTrace();
		}
		}; 
}
