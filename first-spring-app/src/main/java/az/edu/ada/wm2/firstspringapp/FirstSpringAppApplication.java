package az.edu.ada.wm2.firstspringapp;
import java.io.Serializable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController("/university")
public class FirstSpringAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringAppApplication.class, args);
	}

	//@RequestMapping("/")
	@GetMapping("/")
	public String sayHello(){
		return "Hi there";
	}

	@GetMapping("/students")
	public List<Person> getStudents(){
		return List.of(
				new Person("Ali", "Aliyev"),
				new Person("Tural", "Hasanov"),
				new Person("Aliya", "Huseynova")
	);
	}

}

class Person implements Serializible{
	private Person firstName;

	private Person lastName;

	public Person getFirstName;
}