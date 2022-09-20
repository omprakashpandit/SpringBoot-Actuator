package com.javatechie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.controller.EmployeeController;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class SpringbootActuatorApplication {

	public static void main(String[] args) {
		log.info("Start....");
		SpringApplication.run(SpringbootActuatorApplication.class, args);
	}

}

//http://localhost:9090/actuator/ --GET
//http://localhost:9090/actuator/logfile --GET
//http://localhost:9090/actuator/info --GET
//Path: \target\classes\META-INF\build-info.properties --Value get from here when pom.xml(build-info)

//http://localhost:9090/actuator/env --GET
//Custom end point (Actuator) created.
/*POSTMAN
Url: http://localhost:9090/actuator/releases/CRQ123/12-09-2022 --POST
{
    "features":"timezone issue for fix,NPE bug fix"
}
//http://localhost:9090/actuator/releases
*/