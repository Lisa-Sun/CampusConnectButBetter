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
@Table(name = "financial_plan_overview")
@ToString
public class FinancialPlanOverview implements Serializable {

	@Id
	@Column(name = "plan_id")
	public String planId;
	
	@Column(name = "plan_type")
	public String planType;
	
	@Column(name = "plan_amount")
	public int planAmount;
	
	@Column(name = "num_recievers")
	public int numRecievers;
	
	@Column(name = "more_info_link")
	public String moreInfoLink;
}
