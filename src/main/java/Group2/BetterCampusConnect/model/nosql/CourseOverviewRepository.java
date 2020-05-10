package Group2.BetterCampusConnect.model.nosql;


import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;


public interface CourseOverviewRepository extends MongoRepository<CourseOverview, String>{

	public Optional<CourseOverview> findById(String id);

	//public Optional<List<CourseOverview>> search();
	@Query("{ 'name' : ?0 }")
	List<CourseOverview> search(String firstname);
}
