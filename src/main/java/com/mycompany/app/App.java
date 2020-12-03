package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	TesteRunnable th1 =  new TesteRunnable(700, "th1");
    	TesteRunnable th2 =  new TesteRunnable(250, "th2");
    	
    	new Thread(th1).start();
    	new Thread(th2).start();
    }
}
