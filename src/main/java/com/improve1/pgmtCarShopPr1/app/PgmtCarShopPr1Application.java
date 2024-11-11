package com.improve1.pgmtCarShopPr1.app;

import com.improve1.pgmtCarShopPr1.repository.StudentsRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.improve1.pgmtCarShopPr1")
//@ComponentScan(basePackages = {"com.improve1.pgmtCarShopPr1.repositories"})
//@ComponentScan(basePackages = "com.improve1.pgmtCarShopPr1")
// , "com.improve1.pgmtCarShopPr1.controllers"
//@EnableJpaRepositories("com.improve1.pgmtCarShopPr1.repository")
public class PgmtCarShopPr1Application {

	public static void main(String[] args) {
		SpringApplication.run(PgmtCarShopPr1Application.class, args);
	}

}
