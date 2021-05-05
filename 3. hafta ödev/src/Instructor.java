
public class Instructor  extends  User {
	private String trainingCourses;
	public Instructor () {
		
	}

	public Instructor(String trainingCourses) {
		super();
		this.trainingCourses = trainingCourses;
	}

	public String getTrainingCourses() {
		return trainingCourses;
	}

	public void setTrainingCourses(String trainingCourses) {
		this.trainingCourses = trainingCourses;
	}

}
