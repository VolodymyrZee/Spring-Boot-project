package api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Person;
import service.PersonService;

@RequestMapping("api/person")
@RestController
public class PersonController {
	
	private final PersonService personService;
	
	@Autowired   //Spring boot injects the actual service into this constructor
	public PersonController(PersonService personService) { 
		this.personService = personService;
	}
	
	@PostMapping
    public void addPerson(@RequestBody Person person) { 
    	personService.addPerson(person);
    }
	
	public List<Person> getAllPeople () {
		return personService.getAllPeople();
	}
	
}
