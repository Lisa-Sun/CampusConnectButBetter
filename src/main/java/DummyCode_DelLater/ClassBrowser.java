package DummyCode_DelLater;

public class ClassBrowser {

	
	public Course[] getCoursesForRequirement(String requirement) {
		return null;
	}
	
	public Degree getDegree(String name) {
		return null;
	}
	
	public void enroll(User user, String courseId) {
		
	}
	
	public Degree.Requirement[] getRequirements(User user) {
		return null;
	}
	
	public Course[] Search(String query) {
		return null;
	}
	
	//this would be in a separate file
	class User{
		
		public String getFirstName() {
			return null;
		}
		
		public String getLastName() {
			return null;
		}
		
		public String getId() {
			return null;
		}
		
		public String getPasswordHash() {
			return null;
		}
		
		public String getEmail() {
			return null;
		}
		
		public int getGPA() {
			return -1;
		}
		
		public int getAccountBalance() {
			return -1;
		}
		
		public Degree getMajor() {
			return null;
		}

		public int getYear() {
			return -1;
		}
		
		/*if enrolled is false, it gets all courses user has ever taken, if not, only returns enrolled classes*/
		public Course[] getCourses(boolean enrolled) {
			return null;
		}
		
		
		

	}
	
	
	//this would be in a separate file
	public class Degree{
		
		
		public String getName() {
			return null;
		}
		
		public Requirement[] getRequirements() {
			return null;
		}
		
		class Requirement {
			
			public int getCredits() {
				return -1;
			}
			
			public String getName() {
				return null;
			}
			
		}
		
	}
	
	
	//this would be in a separate file
	class Course{
		
		public String getId() {
			return null;
		}
		
		public String getName() {
			return null;
		}
		
		public String[] getPrerequisites() {
			return null;
		}
		
		public String[] getRequiremnts() {
			return null;
		}

		
		public int getWaitlist(){
			return -1;
		}
		
		public int getEnrolled(){
			return -1;
		}
		
		public String getBuilding() {
			return null;
		}
		
		public String getProf() {
			return null;
		}
		
		public String getDescripton() {
			return null;
		}
		
		public String getLocation() {
			return null;
		}
		
	}
	
}
