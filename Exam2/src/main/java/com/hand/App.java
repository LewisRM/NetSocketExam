package com.hand;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       MyServer ms= new MyServer();
       ms.start();
       
       MyClient mc=new MyClient();
       mc.start();
    }
}
