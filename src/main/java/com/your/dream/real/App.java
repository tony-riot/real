package com.your.dream.real;

/**
 * Hello world!
 *
 */
public class App 
{
	private App() 
	{
		// do not create App class directly
	}
	
    public static void main( String[] args ) {
    	for(String arg : args) {
    		logger.log("parameter: " + arg);
    	}
    }
}
