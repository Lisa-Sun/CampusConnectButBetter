package Group2.BetterCampusConnect.model.nosql;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Courses")
public class Course {


	 @Id
	 public String id;
	 public String name;
	 public int sectionNumber;
	 
	 public List<String> majorRequirements;
	 public List<String> prerequisites;
	 public int capacity;
	 public List<String> studentsEnrolled;
	 public List<String> waitList; 
	 public LocalDateTime startTime;
	 public String building;
	 public int room;
	 public List<String> professors;
	 public LocalDateTime startDate;
	 public String description;
	 

	 
	 public Course(String id, String name, int sectionNumber, List<String> majorRequirements, List<String> prerequisites,
			int capacity, List<String> studentsEnrolled, List<String> waitList, LocalDateTime startTime,
			String building, int room, List<String> professors, LocalDateTime startDate, String description) {
		super();
		this.id = id;
		this.name = name;
		this.sectionNumber = sectionNumber;
		this.majorRequirements = majorRequirements;
		this.prerequisites = prerequisites;
		this.capacity = capacity;
		this.studentsEnrolled = studentsEnrolled;
		this.waitList = waitList;
		this.startTime = startTime;
		this.building = building;
		this.room = room;
		this.professors = professors;
		this.startDate = startDate;
		this.description = description;

	}


	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", SectionNumber=" + sectionNumber + ", majorRequirements="
				+ majorRequirements + ", prerequisites=" + prerequisites + ", capacity=" + capacity
				+ ", studentsEnrolled=" + studentsEnrolled + ", waitList=" + waitList + ", startTime=" + startTime
				+ ", building=" + building + ", room=" + room + ", professors=" + professors + ", startDate="
				+ startDate + ", description=" + description + "]";
	}
	
}
