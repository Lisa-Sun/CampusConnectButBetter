package Group2.BetterCampusConnect.model;

import java.io.Serializable;
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
@Table(name = "advisorinfo")
@ToString

public class AdvisorInfo implements Serializable{
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private Long id;
	@Id
	 @Column(name = "advisor_id")
	 private int advisorId;
	 
	 @Column(name = "firstname")
	 private String firstname;
	 
	 @Column(name = "lastname")
	 private String lastname;
	 
	 @Column(name = "lastname_student_section")
	 private String LName_Stu_sec;
}

