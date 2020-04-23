package Group2.BetterCampusConnect;

import Group2.BetterCampusConnect.model.Student;
import Group2.BetterCampusConnect.model.StudentLoginData;
import Group2.BetterCampusConnect.model.StudentLoginRepository;
import Group2.BetterCampusConnect.model.StudentRepository;

import Group2.BetterCampusConnect.model.Professor_Info;
import Group2.BetterCampusConnect.model.Professor_Info_Repository;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.repository.RepositoryDefinition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})


@SpringBootApplication
//@ComponentScan("Group2.BetterCampusConnect.model")
public class BetterCampusConnectApplication {

	
	public static void main(String[] args) {
		
		SpringApplication.run(BetterCampusConnectApplication.class, args);
	}
	
	private static final Logger log = LoggerFactory.getLogger(BetterCampusConnectApplication.class);
	
	
	@Bean
    public CommandLineRunner saveLoginData(StudentLoginRepository repository) {
        return (args) -> {
        	repository.save(new StudentLoginData("123", "marc","marc@gmail.com","f873&#*Gfc8"));
        	repository.save(new StudentLoginData("420", "bob","bob@gmail.com","f9qe7gf8GE"));
        };
   }
	
	@Bean
    public CommandLineRunner showAllLoginData(StudentLoginRepository repository) {
        return (args) -> {
        	for (StudentLoginData customer : repository.findAll()) {
        	      log.info(customer.toString());
        	  }
        };
   }
	
	
	@Bean
    public CommandLineRunner showAllStudentData(StudentRepository repository) {
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
