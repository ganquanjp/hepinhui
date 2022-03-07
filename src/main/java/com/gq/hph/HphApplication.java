package com.gq.hph;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.gq.hph.repository.mapper")
public class HphApplication {

	public static void main(String[] args) {
		SpringApplication.run(HphApplication.class, args);
	}

}
