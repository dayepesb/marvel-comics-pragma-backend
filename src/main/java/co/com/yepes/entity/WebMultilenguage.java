package co.com.yepes.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="person_data")
class Person implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id",nullable = false)
    private long id;

    @Column(name="first_name",nullable = false)
    private String firstName;

    @Column(name="last_name",nullable = false)
    private String lastName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        StringBuilder sb = new StringBuilder();


        sb.append(this.firstName);
        sb.append(" ");
        sb.append(this.lastName);
        return sb.toString();
    }
}

@Repository
interface Personrepository extends JpaRepository<Person, Long> {

}

@Service
@Transactional
class PersonService {

    @Autowired
    private Personrepository personrepository;

    List<Person> findAll() {
        return personrepository.findAll();
    }

}


import co
public class InverterTest {

    @Test
    public void shouldInvert() {
        String word = "";
        String inverted = Inverter.invert(word);

        Assert.fail();
    }

}