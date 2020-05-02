package Group2.BetterCampusConnect.model;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Advisor Repository
 */


@Repository
	public interface AdvisorRepository extends CrudRepository<AdvisorInfo, Integer> {
	    List<AdvisorInfo> findByEmployeeId(String employee_id);
	    
	    @Override
	    List<AdvisorInfo> findAll();
	}
