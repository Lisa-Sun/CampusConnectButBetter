package Group2.BetterCampusConnect.model.nosql;


import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;


public interface LoginRepository extends MongoRepository<LoginData, String>{

	public Optional<LoginData> findById(String id);
	public Optional<LoginData> findByPhone(String phone);
	
	@Query("{ $or: [" + 
			"    {email:?0, passwordHash:?1}," + 
			"    {phone:?0, passwordHash:?1}" +
			"]}")
	public Optional<LoginData> findByLogin(String userfield, String passowrd);
	
	
	
}
