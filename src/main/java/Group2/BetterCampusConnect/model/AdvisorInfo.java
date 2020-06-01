package Group2.BetterCampusConnect.model;

import java.util.List;
import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.*;
import lombok.Data;
import lombok.ToString;


@Data
@Entity
@Table(name = "advisorinfo")
@ToString

public class AdvisorInfo extends EmployeeInfo{
	 @Column(name = "firstname")
	 public String firstname;
	 
	 @Column(name = "lastname")
	 public String lastname;
	
	 @Column(name = "lastname_student_section_id")
	 public String lastname_student_section_id;

	 @OneToMany(
			 mappedBy = "lastNameFirstTwo",
			 cascade = CascadeType.ALL,
			 fetch = FetchType.LAZY)	
	 @ToString.Exclude
	 public List<Student> student;
}

