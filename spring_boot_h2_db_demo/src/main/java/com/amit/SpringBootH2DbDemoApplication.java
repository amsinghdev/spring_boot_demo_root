package com.amit;

import com.amit.entity.Application;
import com.amit.entity.Release;
import com.amit.entity.Ticket;
import com.amit.repository.ApplicationRepository;
import com.amit.repository.ReleaseRepository;
import com.amit.repository.TicketRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootH2DbDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootH2DbDemoApplication.class, args);
	}


	/*private static Logger log = LoggerFactory.getLogger(SpringBootH2DbDemoApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SpringBootH2DbDemoApplication.class, args);
	}
	@Bean
	public CommandLineRunner demo(ApplicationRepository repository)
	{
		return (args)->
		{
			repository.save(new Application("Trackzilla","kesha.williams","Application for tracking bugs."));
			repository.save(new Application("Expenses","mary.jones","Application to track expense reports."));

			for (Application app:repository.findAll())
				log.info("The Application is:"+app.toString());
		};
	};

	@Bean
	public CommandLineRunner demoAll(ReleaseRepository releaseRepository, TicketRepository ticketRepository,ApplicationRepository applicationRepository)
	{
		return(args)->
		{
			releaseRepository.save(new Release("Trackzill Release","21/01/2020"));
			releaseRepository.save(new Release("Expenase Release","01/02/2020"));

			for(Release release:releaseRepository.findAll())
			{
				log.info("The Release is..."+release);
			}

			for (Application application:applicationRepository.findAll())
			{
				for(Release release:releaseRepository.findAll())
				{
					log.info("into for loop...");
					if(application.getName().contains("Trackzill") && release.getDescription().contains("Trackzill"))
					{
						log.info("Into if condation...");
						ticketRepository.save(new Ticket("TrackZill_Issue1","Trackzill comment issue",application,release,"resolved"));
					}
					}
				}
			for(Ticket tkt:ticketRepository.findAll())
			{
				log.info("The Release is..."+tkt);
			}

			};*/

}
