package javaSessions;

public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		try{
			String s = null;
			if(s==null);
			System.out.println("Bye....");

            throw new Exception("Value is null exception");
        }
		
        catch(Exception e){
            e.getMessage();
            e.printStackTrace();
        }

	}
	
	
	
}
