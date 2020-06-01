package Group2.BetterCampusConnect.model;
 
import Group2.BetterCampusConnect.model.Schedule;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;
import com.vladmihalcea.hibernate.type.json.JsonBinaryType;

@Data
@Entity
@Table(name = "student_info")
@ToString
@TypeDefs({
    @TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
})

public class Student implements Serializable {

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

	@Column(name = "Major")
	private String major;

	/* degree_id */
	@Column(name = "Minor")
	private String minor;

	@Column(name = "Degree_level")
	private String degreelevel;

	@ManyToOne
	@JoinColumn(name = "last_name_first_two", referencedColumnName = "lastname_student_section_id")
	private AdvisorInfo lastNameFirstTwo;
	
	@Type(type = "jsonb")
    @Column(columnDefinition = "jsonb")
	@Basic(fetch = FetchType.LAZY)
	private Schedule schedule;

	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getfirstName() {
		return firstName;
	}

	public void setlastName(String lastName) {
		this.lastName = lastName;
	}

	public String getlastName() {
		return lastName;
	}

	public void setemail(String email) {
		this.email = email;
	}

	public String getemail() {
		return email;
	}

	public void setpwd(String pwd) {
		this.pwd = pwd;
	}

	public String getpwd() {
		return pwd;
	}

	public void setstudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getstudentId() {
		return studentId;
	}

	public void setgpa(BigDecimal gpa) {
		this.gpa = gpa;
	}

	public BigDecimal getgpa() {
		return gpa;
	}

	public void setmajor(String major) {
		this.major = major;
	}

	public String getmajor() {
		return major;
	}

	public void setminor(String minor) {
		this.minor = minor;
	}

	public String getminor() {
		return minor;
	}
	public void setdegreelevel(String degreelevel) {
		this.degreelevel = degreelevel;
	}

	public String getdegreelevel() {
		return degreelevel;
	}
	public void setaccountbalance(BigDecimal accountbalance) {
		this.accountbalance = accountbalance;
	}

	public BigDecimal getaccountbalance() {
		return accountbalance;
	}
	
	public AdvisorInfo getLastNameFirstTwo() {
		return this.lastNameFirstTwo;
	}
}
