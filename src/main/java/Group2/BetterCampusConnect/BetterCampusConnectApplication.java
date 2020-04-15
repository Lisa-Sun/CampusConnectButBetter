package Group2.BetterCampusConnect;

import Group2.BetterCampusConnect.model.Student;
import Group2.BetterCampusConnect.model.StudentRepository;



import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@SpringBootApplication
public class BetterCampusConnectApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(BetterCampusConnectApplication.class, args);
	}
	
	private static final Logger log = LoggerFactory.getLogger(BetterCampusConnectApplication.class);
	
	   @Bean
	    public CommandLineRunner showAllCourses(StudentRepository repository) {
	        return (args) -> {
	            // fetch all customers
	            log.info("Students found with findAll():");
	            log.info("-------------------------------");
	            repository.findAll().forEach((student) -> {
	                log.info(student.toString());
	            });
	            log.info("-------------------------------");
	        };
	   }
	   

}
