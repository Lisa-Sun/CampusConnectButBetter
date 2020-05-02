package Group2.BetterCampusConnect.model;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * DegreeRepository
 */


@Repository
	public interface DegreeRepository extends CrudRepository<Degree, Integer> {
	    List<Degree> findByDegreeId(int degree_id); 
	    
	    @Override
	    List<Degree> findAll();
	}

