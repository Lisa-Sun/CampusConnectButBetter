package Group2.BetterCampusConnect;

import Group2.BetterCampusConnect.model.Student;
import Group2.BetterCampusConnect.model.StudentRepository;

import Group2.BetterCampusConnect.model.Professor_Info;
import Group2.BetterCampusConnect.model.Professor_Info_Repository;


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
	    public CommandLineRunner showAllStudents(StudentRepository repository) {
	        return (args) -> {
	            // fetch all students
	            log.info("Students found with findAll():");
	            log.info("-------------------------------");
	            repository.findAll().forEach((student) -> {
	                log.info(student.toString());
	            });
	            log.info("-------------------------------");
	        };
	   }
	   
	   @Bean
	   public CommandLineRunner showAllProfessors(Professor_Info_Repository profRepoSql)
	   {
		   return(args)-> {
			   log.info("Professors found with findAll():");
	            log.info("-------------------------------");
	            profRepoSql.findAll().forEach((professor_info) -> {
	                log.info(professor_info.toString());
	            });
	            log.info("-------------------------------");
		   };
	   }
	   
	   
	   

}
