package com.example.JPATest;

import org.springframework.boot.SpringApplication;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class JpaExampleApplication{

	private static final Logger log = LoggerFactory.getLogger(JpaExampleApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(JpaExampleApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(VehiculeRepository repository) {
		return (args) -> {
			
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			Date date = dateFormat.parse("2018-10-09");
			log.info(date.toString());

			Date date2 = dateFormat.parse("2018-10-12");
			log.info(date.toString());
			
			Vehicule myCar = new Vehicule(1234);
			Vehicule car = new Car(2345, 4);
			Vehicule van = new Van(3456, 500);
			Person me = new Person("Jef", 1);
			Person you = new Person("Jack", 2);
			Person somebody = new Person("John", 3);
			Rent rental = new Rent(date, date2, 13, myCar, me);
			Rent rental2 = new Rent(date, date2, 1, van, you);
			Rent rental3 = new Rent(date, date2, 2, car, somebody);
			
					
			me.getRent().add(rental);
			myCar.getRent().add(rental);
			
			you.getRent().add(rental2);
			van.getRent().add(rental2);
			
			somebody.getRent().add(rental3);
			car.getRent().add(rental3);
			
			repository.save(van);
			repository.save(myCar);
			repository.save(car);
		};
	
	}
	
}
	


