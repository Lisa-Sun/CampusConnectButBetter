package Group2.BetterCampusConnect.model.nosql;


import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface CourseRepository extends MongoRepository<Course, String>{

	public Optional<Course> findById(String id);

	
	
	
}
