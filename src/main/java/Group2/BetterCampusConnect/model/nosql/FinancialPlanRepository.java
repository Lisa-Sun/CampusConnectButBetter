package Group2.BetterCampusConnect.model.nosql;


import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface FinancialPlanRepository extends MongoRepository<FinancialPlan, String>{

	public Optional<FinancialPlan> findById(String id);

	
	
	
}
