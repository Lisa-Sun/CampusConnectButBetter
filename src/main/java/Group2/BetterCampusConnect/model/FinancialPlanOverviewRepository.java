package Group2.BetterCampusConnect.model;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface FinancialPlanOverviewRepository extends CrudRepository<FinancialPlanOverview, String> {
	List<FinancialPlanOverview> findByPlanId(String plan_id);
	
	@Override
	List<FinancialPlanOverview> findAll();
	
}
