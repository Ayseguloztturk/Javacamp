
public class UserManager {
	public void add(User user)
	{
		System.out.println(" sisteme giri� yap�ld� : " + user.getFirstname() );
		System.out.println(" profil d�zenlendi  :  " + user.getFirstname() );
		
	}
	public void addMultiple(User[] users)
	{
		for(User user : users)
		{
			add(user);
		}
	}
}
