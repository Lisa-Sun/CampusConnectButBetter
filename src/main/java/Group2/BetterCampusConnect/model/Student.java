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
@Table(name = "student")
@ToString

public class Student implements Serializable{
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private Long id;
	@Id
	 @Column(name = "student_id")
	 private String student_id;
	 
	 @Column(name = "first_name")
	 private String firstName;
	 
	 @Column(name = "last_name")
	 private String lastName;
	 
}
