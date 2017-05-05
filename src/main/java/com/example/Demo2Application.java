package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.endpoint.MetricReaderPublicMetrics;
import org.springframework.boot.actuate.endpoint.PublicMetrics;
import org.springframework.boot.actuate.metrics.repository.InMemoryMetricRepository;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Demo2Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
	}

	@Bean
	InMemoryMetricRepository inMemoryMetricRepository(){
		return new InMemoryMetricRepository();
	}

	@Bean
	PublicMetrics publicMetrics(InMemoryMetricRepository repository){
		return new MetricReaderPublicMetrics(repository);
	}
}
