package Group2.BetterCampusConnect.model.nosql;


import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;


public interface CourseOverviewRepository extends MongoRepository<CourseOverview, String>{

	public Optional<CourseOverview> findById(String id);

	/*
	 * If we ever need to do a "greater than (arbitrary number) level course" search we can use this 
	 * query in the or expression to convert the section number to a string and do comparisons
	 * 
	 * { $expr: { $gt: [{ $toDouble: "$sectionNumber" }, 100] } }
	 * 
	 */
	@Query("{ $or: [" + 
			"    {name:{'$regex' : \"?0\", '$options' : 'i'}}," + 
			"    {sectionNumber:{'$regex' : \"?0\", '$options' : 'i'}}," +
			"    {description:{'$regex' : \"?0\", '$options' : 'i'}}" +
			"]}")
	List<CourseOverview> search(String query);
}
