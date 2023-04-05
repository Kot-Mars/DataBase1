package com.DataBase.DataBase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(name = "", produces = "application/json")
//@Import(PersonRep.class)
public class PersonController {

//    @Value("Sveta")
//    String name;


    PersonRep personRep;



    @Autowired
    public PersonController(PersonRep personRep) {
        this.personRep = personRep;
    }


    @RequestMapping("/create-person")
    public Person createPerson() {
        return personRep.save(new Person());
    }

    @RequestMapping("/find/{id}")
    public Optional<Person> findPerson(@PathVariable Long id) {
        return  personRep.findById(id);
    }

    @RequestMapping("/delete-person")
    public  void deletePerson() {
        personRep.deleteAll();
    }

}
