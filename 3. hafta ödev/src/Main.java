

public class Main {

	public static void main(String[] args) {
	Student student1 = new Student ();
	student1.setFirstname("ay�eg�l");
	student1.setLastName("�zt�rk");
	student1.setMail("aysegul@gmail.com");
	student1.setCourses("Java +React");

	
	Student student2 = new Student ();
	student2.setFirstname("can");
	student2.setLastName("�zt�rk");
	student2.setMail("can@gmail.com");
	student2.setCourses("c#");
    
    Student student3 = new Student ();
    student3.setFirstname("ahmet");
    student3.setLastName("can");
    student3.setMail("Ahmet@gmail.com");
    student3.setCourses("programlamaya giri� i�in temel kurs");
 
   UserManager usermanager = new UserManager();
     User [] users = {student1,student2,student3};
     usermanager .addMultiple(users);
  
   
    System.out.println("toplam ��renci say�s� =  " + users.length);
    
    StudentManager studentmanager = new  StudentManager();
    Student [] students = {student1,student2,student3};
    studentmanager.addMultiple(students);
    
    Instructor instructor1 = new Instructor();
    instructor1.setFirstname("Engin");
    instructor1.setLastName("Demiro�");
    instructor1.setMail("Egindemiro�@gmail.com");
    instructor1.setTrainingCourses("java");

    
   InstructorManager instructormanager = new InstructorManager();
  instructormanager.add(instructor1);
 
   
  
 
	}

	
}
