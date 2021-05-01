package oopintro;

public class Main {

	public static void main(String[] args) {
			
		Catagory catagory1 = new Catagory("java + react","Engin Demiro�", 1 );
		Catagory catagory2 = new Catagory("c# + Angular","Engin Demiro�", 2 );
		Catagory catagory3 = new Catagory("programlamaya giri� i�in temel kurs","Engin Demiro�", 3 );
			
		Catagory[] catagories = {catagory1,catagory2,catagory3};
		System.out.println("toplam kurs say�s� :");
		System.out.println(catagories.length);
		
		for (Catagory catagory : catagories )
		{
			System.out.println("***Kurs Bilgileri**");
			System.out.println(catagory.name);
			System.out.println(catagory.educator);
			System.out.println(catagory.id);
			
		}
		
		CatagoryManager catagorymanager = new CatagoryManager();
		catagorymanager.search(catagory1);
		catagorymanager.search(catagory2);
		catagorymanager.search(catagory3);
		
         Login login1 = new Login ("Asdfdsg","sfdgff");
         Login login2 = new Login ("sdgdgf","sdfdg");
         Login login3 = new Login ("ccvbmcb","dlfdg");
         Login login4 = new Login ("nxvmbn","kdgjf");
         Login login5 = new Login ("dmfdkg","fjhgdjg");
         
         Login[] logins = {login1,login2,login3,login4,login5};
         System.out.println(logins.length);
         
         Loginmanager loginmanager = new Loginmanager ();
         loginmanager.login(login1);
         loginmanager.login(login2);
         loginmanager.login(login3);
         loginmanager.login(login4);
         loginmanager.login(login5);
         
	}

}
