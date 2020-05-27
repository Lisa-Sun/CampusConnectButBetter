package Group2.BetterCampusConnect.model;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface FinancialPlanOverviewRepository extends CrudRepository<FinancialPlanOverview, String> {
	public Optional<FinancialPlanOverview> findById(String id);

	
	@Query(value = "SELECT * FROM financial_plan_overview",
		nativeQuery = true)
	List<FinancialPlanOverview> search(String query);
}
