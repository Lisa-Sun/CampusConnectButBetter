package Group2.BetterCampusConnect.model;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Repository

public interface ImpDatesRepository extends CrudRepository<ImpDates, String>{
List<ImpDates> findBydateId(String imp_dates); 
    
    @Override
  
    List<ImpDates> findAll();
}
