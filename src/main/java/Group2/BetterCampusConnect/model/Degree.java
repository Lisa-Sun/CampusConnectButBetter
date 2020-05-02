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
@Table(name = "degree")
@ToString

public class Degree implements Serializable{
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private Long id;
	@Id
	 @Column(name = "degree_id")
	 private int degreeId;
	 
	 @Column(name = "degree_name")
	 private String degreeName;
	 
	 /*Letter grade*/
	 @Column(name = "minimum_grade")
	 private String minimumgrade;
	 
	 @Column(name = "cost_per_credit")
	 private int costpercredit;
	 
}

