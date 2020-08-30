

public class ThrowKeyword {

	public static void main(String[] args)  {
		
		//throw keyword is used when throwing an exception deliberately 
		
	
		System.out.println("ABC");
		
		try {
		throw new Exception ("New Exception");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("PQR");
		
		String ExecutionFlag= "N";
		if(ExecutionFlag.equals("N")) {
			try {
			throw new Exception("Exec flag is NO Exception");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	}