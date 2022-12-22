package grafana_data_feeder.service;

import com.github.javafaker.Faker;
import grafana_data_feeder.model.Bank;
import grafana_data_feeder.repository.BankRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class BankServiceImpl implements BankService {

    @Autowired
    private BankRepo bankRepo;

    Faker faker = new Faker();

    int id[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};

    @Scheduled(cron = "*/10 * * * * *")
    public void loadData() {

        for (int i = 0; i < 16; i++) {

            Bank bank = bankRepo.findById(id[i]).get();
            bank.setTerminalStats(faker.number().randomDouble(2, 1, 99));
            bankRepo.save(bank);

            System.out.println(bank);
        }

    }

}
