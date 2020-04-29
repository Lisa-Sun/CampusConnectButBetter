package Group2.BetterCampusConnect.model.nosql;

import org.springframework.data.annotation.Id;

public class LoginData {


	 @Id
	 public String id;
	 public String email;
	 public String phone;
	 public String passwordHash;
	 public boolean admin;
	 
	 public LoginData(String id, boolean admin, String email, String phone, String passwordHash) {
		 this.id = id;
		 this.passwordHash = passwordHash;
		 this.email = email;
		 this.phone = phone; 
		 this.admin = admin;
	 }
	 
	 public String toString() {
		 	if(!admin) {
			    return String.format(
			        "Student[id=%s, passwordHash='%s', email='%s', phone='%s']",
			        id, passwordHash, email, phone);
		 	}else {
		 		return String.format(
				        "Admin[id=%s, passwordHash='%s', email='%s', phone='%s']",
				        id, passwordHash, email, phone);
		 	}
	 }
	
}
