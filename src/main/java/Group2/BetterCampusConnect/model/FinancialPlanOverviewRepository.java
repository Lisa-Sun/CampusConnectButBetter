package Group2.BetterCampusConnect.model;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FinancialPlanOverviewRepository extends CrudRepository<FinancialPlanOverview, String> {
	List<FinancialPlanOverview> findByPlanId(String plan_id);
	
	@Override
	List<FinancialPlanOverview> findAll();
	
	@Query(
		value = "SELECT * FROM financial_plan_overview WHERE TABLE_NAME = 'financial_plan_overview'",
		nativeQuery = true)
	List<FinancialPlanOverview> search(String query);
}
