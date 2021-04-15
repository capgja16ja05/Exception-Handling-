package day7.task1;

// create Custom Exception



public class CustomException {

	public static void main(String[] args) {
		
		BookingService service = new BookingService();
		
		try
		{
			
			service.doBooking(5);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		
		
		
	}
}
