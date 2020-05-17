package Group2.BetterCampusConnect.model;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.id.Assigned;
import lombok.Data;
import lombok.ToString;


@Data
@Entity
@Table(name = "degree_requirement")
@ToString

public class Degree_Requirement implements Serializable{

	 @Id
	 @Column(name = "degree_id")
	 private int degreeId;
	 @Column(name = "course_id")
	 private int courseid;
	 
}

