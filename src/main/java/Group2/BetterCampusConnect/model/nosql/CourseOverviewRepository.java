package Group2.BetterCampusConnect.model.nosql;


import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface CourseOverviewRepository extends MongoRepository<CourseOverview, String>{

	public Optional<CourseOverview> findById(String id);

	
	
	
}
