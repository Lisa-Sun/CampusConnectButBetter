package Group2.BetterCampusConnect.model;

import org.springframework.data.annotation.Id;

public class StudentLoginData {


	 @Id
	 public String id;
	 public String email;
	 public String phone;
	 public String passwordHash;
	
	 
	 public StudentLoginData(String id, String email, String phone, String passwordHash) {
		 this.id = id;
		 this.passwordHash = passwordHash;
		 this.email = email;
		 this.phone = phone; 
	 }
	 
	 public String toString() {
		    return String.format(
		        "Customer[id=%s, passwordHash='%s', email='%s', phone='%s']",
		        id, passwordHash, email, phone);
	 }
	
}
