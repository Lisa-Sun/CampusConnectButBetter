package Group2.BetterCampusConnect.model.nosql;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "FinancialPlans")
public class FinancialPlan {


	 @Id
	 public String id;
	 public float ammountDue;
	 public float ammounPayed;
	 public boolean fulltimeStudent;
	 public boolean employed;
	 
	 
	 
	public FinancialPlan(String id, float ammountDue, float ammounPayed, boolean fulltimeStudent, boolean employed) {
		super();
		this.id = id;
		this.ammountDue = ammountDue;
		this.ammounPayed = ammounPayed;
		this.fulltimeStudent = fulltimeStudent;
		this.employed = employed;
	}



	@Override
	public String toString() {
		return "FinancialPlan [id=" + id + ", ammountDue=" + ammountDue + ", ammounPayed=" + ammounPayed
				+ ", fulltimeStudent=" + fulltimeStudent + ", employed=" + employed + "]";
	}
	 
	 
	
}
