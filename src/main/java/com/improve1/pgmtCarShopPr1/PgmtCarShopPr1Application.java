package com.improve1.pgmtCarShopPr1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.improve1.pgmtCarShopPr1.repositories"})
public class PgmtCarShopPr1Application {

	public static void main(String[] args) {
		SpringApplication.run(PgmtCarShopPr1Application.class, args);
	}

}
