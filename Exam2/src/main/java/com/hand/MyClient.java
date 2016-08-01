package com.hand;

import java.util.Scanner;

public class MyClient extends Thread {
	
	@Override
	public void run() {
		TransClient tc = new TransClient("127.0.0.1", 12345);
		tc.start();
	}
}
