

public class StudentManager {
	public void add(Student student)
	{
		System.out.println(" kurs kayd� olu�turuldu "  + student.getCourses() );
	}
	public void addMultiple(Student[] students)
	{
		for(Student student : students)
		{
			add(student);
		}
}
}