package com.sbu.productservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@SpringBootApplication
@RestController
@EnableScheduling
public class ProductServiceApplication {

	@GetMapping("/status")
	public  String getStatus(){
		return "Application is running...!!";
	}

	@Scheduled(fixedDelay = 1000)
	public void printTime(){
		System.out.println("Current Time :"+ new Date());
	}

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
	}

}
