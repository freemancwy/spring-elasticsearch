package com.chaoweiY.spring_elasticsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class SpringElasticsearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringElasticsearchApplication.class, args);
	}

}
