package Group2.BetterCampusConnect.model;


import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface StudentLoginRepository extends MongoRepository<StudentLoginData, String>{

	public Optional<StudentLoginData> findById(String id);
	public Optional<StudentLoginData> findByPhone(String phone);
	public Optional<StudentLoginData> findByEmail(String email);
	
	
	
}
