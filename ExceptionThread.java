package randomTesting;

import java.io.IOException;

public class ExceptionThread implements Runnable {

	@Override
	public void run() {
			
		try
		{
			throw new RuntimeException();
		}
		
		catch(Exception e)
		{
			
		}
	}

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		ExceptionThread et = new ExceptionThread();
			
			Thread t1= new Thread(et);
			
			t1.start();
			
			
	}
	
	

}
