package Group2.BetterCampusConnect.model.nosql;

import java.time.LocalDateTime;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "CourseOverviews")
public class CourseOverview {


	 @Id
	 public String id;
	 public String name;
	 public String sectionNumber;
	 

	 public LocalDateTime startDate;
	 public String location;
	 public String description;
	 
	 
	 
	public CourseOverview(String id, String name, String sectionNumber, LocalDateTime startDate, String location,
			String description) {
		super();
		this.id = id;
		this.name = name;
		this.sectionNumber = sectionNumber;
		this.startDate = startDate;
		this.location = location;
		this.description = description;
	}



	@Override
	public String toString() {
		return "CourseOverview [id=" + id + ", name=" + name + ", sectionNumber=" + sectionNumber + ", startDate="
				+ startDate + ", location=" + location + ", description=" + description + "]";
	}
	 


}
