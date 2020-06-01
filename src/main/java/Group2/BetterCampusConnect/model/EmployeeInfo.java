package Group2.BetterCampusConnect.model;

import Group2.BetterCampusConnect.model.enumTypes.EmployeeType;
import Group2.BetterCampusConnect.model.enumTypes.EmployeeStatus;
import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Date;
import lombok.Data;
import lombok.ToString;



@Data
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "employee_info")
@ToString
public class EmployeeInfo implements Serializable{
	
	@Id
	 @Column(name = "employee_id", nullable = false)
	 private String employeeId;
	
	@Column(name = "employee_type", nullable = false)
	@Enumerated(EnumType.STRING)
	private EmployeeType employeeType;
	
	@Column(name = "employee_status",  nullable = false)
	@Enumerated(EnumType.STRING)
	private EmployeeStatus employeeStatus;
	
	@Column(name = "employee_email")
	public String employeeEmail;
	
	private String employeeNumber;

}
