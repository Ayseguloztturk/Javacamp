package oopintro;

public class Login {
	public Login ()
	{
		System.out.println("sistem çalýþtý");
	}
	public Login (String username, String password )
			
	{
		this();
		this.password=password;
		this.username=username;
		
	}
	
	String username ;
	String password;
}
