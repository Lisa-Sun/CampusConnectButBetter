package Group2.BetterCampusConnect.model;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Degree_Requirement Repository
 */


@Repository
public interface Degree_Requirement_Repository extends CrudRepository<Degree_Requirement, Integer> {
    
    
    @Override
    List<Degree_Requirement> findAll();
}

