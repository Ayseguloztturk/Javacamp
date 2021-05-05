

public class User {
   private String firstname;
   private String lastName;
   private  String mail;
 public User() {
	 
 }
public User(String firstname, String lastName, String mail) {
	super();
	this.firstname = firstname;
	this.lastName = lastName;
	this.mail = mail;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}

}
