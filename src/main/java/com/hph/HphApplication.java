package com.hph;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hph.domain.mapper")
public class HphApplication {

	public static void main(String[] args) {
		SpringApplication.run(HphApplication.class, args);
	}

}
