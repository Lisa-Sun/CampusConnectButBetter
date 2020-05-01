package Group2.BetterCampusConnect.model;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Repository

public interface EmployeeInfo_Repository extends CrudRepository<EmployeeInfo, String>{
	
	List<EmployeeInfo> findByEmployeeId(String employee_id); 
    
    @Override
  
    List<EmployeeInfo> findAll();

}
