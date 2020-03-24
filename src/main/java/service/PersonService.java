package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import dao.PersonDao;
import model.Person;




@Service
public class PersonService {
	
	
	private final PersonDao personDao;
	
	
	@Autowired    //Spring boot injects the actual service into this constructor
	public PersonService(@Qualifier("fakeDao") PersonDao personDao) {
		this.personDao = personDao;
	}
	
	public int addPerson(Person person) {
		return personDao.insertPerson(person);
	}

	public List<Person> getAllPeople (){
		return personDao.selectAllPeople();
	}
	
}
