package Group2.BetterCampusConnect.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;
import lombok.ToString;


@Data
@Entity
@Table(name = "student_info")
@ToString
public class Student implements Serializable{

	@Id
	 @Column(name = "student_id")
	 private String studentId;
	 
	 @Column(name = "first_name")
	 private String firstName;
	 
	 @Column(name = "last_name")
	 private String lastName;
	 
	 @Column(name = "Email")
	 private String email;
	 
	 @Column(name = "Pwd")
	 private String pwd;
	 
	 @Column(name = "GPA")
	 private BigDecimal gpa;
	 
	 @Column(name = "Account_Balance")
	 private BigDecimal accountbalance;
	 
	 /*degree_id*/
	 @Column(name = "Major")
	 private int major;
	 
	 /*degree_id*/
	 @Column(name = "Minor")
	 private int minor;
	 
	 @Column(name = "Degree_level")
	 private String degreelevel;
	 
	 @ManyToOne
	 @JoinColumn(name = "last_name_first_two", referencedColumnName = "lastname_student_section_id")
	 private AdvisorInfo lastNameFirstTwo;
}
