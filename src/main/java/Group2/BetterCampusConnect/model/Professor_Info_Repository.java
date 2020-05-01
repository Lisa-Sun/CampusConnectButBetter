package Group2.BetterCampusConnect.model;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 * Professor_Info_Base_SQL_Repository
 */


public interface Professor_Info_Repository extends CrudRepository<Professor_Info, String> {
    List<Professor_Info> findByProfessorId(String professor_id); 
    
    @Override
  
    List<Professor_Info> findAll();
}

