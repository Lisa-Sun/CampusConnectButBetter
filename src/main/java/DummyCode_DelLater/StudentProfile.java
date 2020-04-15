package DummyCode_DelLater;

public class StudentProfile {



	public void GetJSonPropertyList(String jsonTableName, String jsonPropertyName)
	{
		
	}
	
	public void UpdatJsonProperty(String jsonTableName, String updatePropertyName, String updatedPropertyValue)
	{
		
		
	}
	
	/*Show classes id that the student has enrolled and taken*/
	/*Used DB: Class, Student*/
	public static int[] GetCourseHistory(int Id){
		return new int [] {0,1,2};
	}
	
	/*Show student info*/
	/*Used DB: Student*/
	public static String[] GetStudentInfo(int Id) {
		
		return new String[] {"Edward", "Lin","edward30525@gmail.com","etc."};
	} 
	
	/*Pay tuition*/
	/*Used DB: Student*/
	public static void PayTuition(int Id, int payment) {
		
		/*DB.Student.AccountBalance += payment*/
	}
}



