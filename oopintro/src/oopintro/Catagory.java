package oopintro;


public class Catagory {
	public Catagory() {
		System.out.println("sistem �al��t�");
	}
	
	
	public Catagory (String name,String educator,int id) {
		this();
		this.name = name;
		this.educator = educator;
		this.id=id;
	
	}
	
	String name ;
	String educator;
	int id;
}
