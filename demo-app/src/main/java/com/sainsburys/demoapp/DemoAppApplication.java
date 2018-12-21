package com.sainsburys.demoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.sainsburys.demoapp.property.FileStorageProperties;


@SpringBootApplication
@EnableConfigurationProperties({
        FileStorageProperties.class
})

public class DemoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoAppApplication.class, args);
	}

}

