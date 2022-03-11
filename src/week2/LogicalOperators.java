package week2;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String phonenumber = "9851163785";
		String username = "dharma";
		String password = "admin123";
		
		if((phonenumber=="" || username == "dharma") && password=="admin3")
		{
			System.out.println("Login Success");	
		}
		else
		{
			System.out.println("Login Failed");
		}
	}

}
