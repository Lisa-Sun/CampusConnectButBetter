package Group2.BetterCampusConnect.model;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * StudentRepository
 */


@Repository
public interface StudentRepository extends CrudRepository<Student, String> {
    Student findByStudentId(String studentId); 
    
    @Override  
    List<Student> findAll();
}

