package com.karthinvk.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.karthinvk.springboot.service.EmployeeService;

@SpringBootApplication
@RestController
public class SpringBootDemoApplication {
	
	String str = "</html>\n<body bgcolor=\"blue\">\n<h1><marquee>Hello kavipriyan</marquee></h1>\n<h1><marquee>Hello Harinika</marquee></h1>\n</body>\n</html>";

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}
	
	@Autowired
	EmployeeService empService;
	
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
	return String.format("Hello %s!", name);
	}
	
	@GetMapping("/color")
	@ResponseBody
	public String colorChange(@RequestParam(value = "colorname", defaultValue = "green") String name) {
		str = str.replace("blue", name);
	return str;
	}
	
	@GetMapping("/testAutoWire")
	public String testAutoWire() {
	return empService.getString();
	}

}
