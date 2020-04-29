package Group2.BetterCampusConnect.model.nosql;


import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface LoginRepository extends MongoRepository<LoginData, String>{

	public Optional<LoginData> findById(String id);
	public Optional<LoginData> findByPhone(String phone);
	public Optional<LoginData> findByEmail(String email);
	
	
	
}
