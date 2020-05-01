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
import java.util.Date;
import lombok.Data;
import lombok.ToString;


@Data
@Entity
@Table(name = "impdates")
@ToString
public class ImpDates{
	
	@Id
	 @Column(name = "date_id")
	 private String dateId;
	
	@Column(name = "start_date", columnDefinition = "DATE")
	private Date startDate;
	
	@Column(name = "end_date", columnDefinition = "DATE")
	private Date endDate;
	
}
