/* package grafana_data_feeder.model;

import com.github.javafaker.Faker;
import grafana_data_feeder.repository.BankRepo;
import grafana_data_feeder.repository.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SampleDataLoader implements CommandLineRunner {

    int id[] = {1,2,3,4,5};

    //private final PersonRepo personRepo;

    @Autowired
    private final BankRepo bankRepo;

    private final Faker faker;

    public SampleDataLoader(PersonRepo personRepo, BankRepo bankRepo) {
        //this.personRepo = personRepo;
        this.bankRepo = bankRepo;
        this.faker = new Faker();
    }




    @Override
    public void run(String... args) throws Exception {

        List<Person> people = new ArrayList<>();

        String firstName = faker.name().firstName();

        System.out.println(firstName);

    /*    for(int i = 0; i < 20; i++) {

            Person person = new Person(faker.name().firstName(), faker.number()
                    .randomDouble(2, 4, 99));

            people.add(person);

            System.out.println(person.toString());

        }

        personRepo.saveAll(people);

     */

/*
    }


    public void generateDouble() {

        for(int i = 0; i < 5; i++) {
        Bank bank = bankRepo.findById(id[i]).get();
        bank.setTerminalStats(faker.number().randomDouble(2, 1, 99));

        }

    }


}

*/
