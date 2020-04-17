package Group2.BetterCampusConnect.model;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 * StudentRepository
 */


	
	public interface StudentRepository extends CrudRepository<Student, Long> {
	    List<Student> findByStudentId(String student_id); 
	    
	    @Override
	  
	    List<Student> findAll();
	}

