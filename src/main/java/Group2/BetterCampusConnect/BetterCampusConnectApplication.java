package Group2.BetterCampusConnect;

import Group2.BetterCampusConnect.model.Student;
import Group2.BetterCampusConnect.model.StudentRepository;
import Group2.BetterCampusConnect.model.nosql.Course;
import Group2.BetterCampusConnect.model.nosql.CourseOverview;
import Group2.BetterCampusConnect.model.nosql.CourseOverviewRepository;
import Group2.BetterCampusConnect.model.nosql.CourseRepository;
import Group2.BetterCampusConnect.model.nosql.FinancialPlan;
import Group2.BetterCampusConnect.model.nosql.FinancialPlanRepository;
import Group2.BetterCampusConnect.model.nosql.LoginData;
import Group2.BetterCampusConnect.model.nosql.LoginRepository;

import Group2.BetterCampusConnect.model.Professor_Info;
import Group2.BetterCampusConnect.model.Professor_Info_Repository;

import Group2.BetterCampusConnect.model.EmployeeInfo;
import Group2.BetterCampusConnect.model.EmployeeInfo_Repository;

import Group2.BetterCampusConnect.model.ImpDates;
import Group2.BetterCampusConnect.model.ImpDatesRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.repository.RepositoryDefinition;

import java.time.LocalDateTime;
import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})

/*
@SpringBootApplication(scanBasePackages= {"Group2.BetterCampusConnect.model"})
@ComponentScan({"Group2.BetterCampusConnect.model"})
@EntityScan({"Group2.BetterCampusConnect.model"})*/
@SpringBootApplication
public class BetterCampusConnectApplication {

	
	public static void main(String[] args) {
		
		SpringApplication.run(BetterCampusConnectApplication.class, args);
	}
	
	private static final Logger log = LoggerFactory.getLogger(BetterCampusConnectApplication.class);
	
	
	@Bean
    public CommandLineRunner saveCourseData(CourseRepository course) {
        return (args) -> {
        	course.save(new Course(
        			"f33f32", "Mat", "101", Arrays.asList("dqdf32f3"), 
        			Arrays.asList("2r2rf23f"), 20, Arrays.asList("f32fw","fewf8w"), 
        			Arrays.asList(), LocalDateTime.of(2020, 6, 15, 18,0), "DePaul Center", 10024, Arrays.asList("Steve","Barns"), 
        			LocalDateTime.now(), "Math lessons, for the guys"));
        };
   }
	
	@Bean
    public CommandLineRunner saveCourseOverviewData(CourseOverviewRepository course) {
        return (args) -> {
        	course.save(new CourseOverview(
        			"f33f32", "Mat", "101",  LocalDateTime.of(2020, 6, 15, 18,0),"DePaul Center", "Math lessons, for the guys"));
        	course.save(new CourseOverview(
        			"432fh8", "Sci", "202", LocalDateTime.now(),"Lincoln Parks", "Science lessons, for the gals"));
        };
   }
	
	
	@Bean
    public CommandLineRunner saveLoginData(LoginRepository repository) {
		 return (args) -> {
	        	repository.save(new LoginData("123", false, "marc@gmail.com","630 999 9999","marc123"));
	        	repository.save(new LoginData("456", false, "bob@gmail.com","630 420 6969","bob123"));
	        	repository.save(new LoginData("1234abcd", false, "JSmith@depaul.edu","630 420 6969","abcd1234"));
	        };
   }
	
	@Bean
    public CommandLineRunner saveFinancialPlan(FinancialPlanRepository repository) {
        return (args) -> {
        	repository.save(new FinancialPlan("123", 12000, 1000, true, false));
        	
        	
        };
   }
	
	@Bean
    public CommandLineRunner showAllLoginData(LoginRepository repository) {
        return (args) -> {
        	System.out.println("\nLogin Credentials (Mongo)");
        	for (LoginData user : repository.findAll()) {
        		System.out.println("\t"+user.toString());
        	}
        };
   }
	
	@Bean
    public CommandLineRunner showAllCourses(CourseRepository repository) {
        return (args) -> {
        	System.out.println("\nCourses (Mongo)");
        	for (Course course : repository.findAll()) {
        		System.out.println("\t"+course.toString());
        	}
        };
   }
	
	@Bean
    public CommandLineRunner showAllCourseOverviews(CourseOverviewRepository repository) {
        return (args) -> {
        	System.out.println("\nCourse Overviews (Mongo)");
        	for (CourseOverview course : repository.findAll()) {
        		System.out.println("\t"+course.toString());
        	}
        };
   }
	
	@Bean
    public CommandLineRunner showAllFinancialPlans(FinancialPlanRepository repository) {
        return (args) -> {
        	System.out.println("\nFinancialPlans (Mongo)");
        	for (FinancialPlan course : repository.findAll()) {
        		System.out.println("\t"+course.toString());
        	}
        	 System.out.println("\n");
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
   
   
   @Bean
   public CommandLineRunner showAllImpDates(ImpDatesRepository impDatesSql)
   {
	   return(args)-> {
		   log.info("ImpDates found with findAll():");
            log.info("-------------------------------");
            impDatesSql.findAll().forEach((imp_dates) -> {
                log.info(imp_dates.toString());
            });
            log.info("-------------------------------");
	   };
   }
   
   @Bean
   public CommandLineRunner showAllEmployeeInfo(EmployeeInfo_Repository employeeInfoSQL)
   {
	   return(args)-> {
		   log.info("Employee found with findAll():");
            log.info("-------------------------------");
            employeeInfoSQL.findAll().forEach((employee_id) -> {
                log.info(employee_id.toString());
            });
            log.info("-------------------------------");
	   };
   }
	
	
   
   @Bean
   public CommandLineRunner showProfessorInfoId(Professor_Info_Repository professorRepo)
   {
	   Professor_Info profInfo = professorRepo.findByEmployeeId("d1c2b3a4");

	   return(args) ->{
		   System.out.println("----------------");
		   System.out.println(profInfo.toString()); 
	   };
	
   }
   
   
	   

}
