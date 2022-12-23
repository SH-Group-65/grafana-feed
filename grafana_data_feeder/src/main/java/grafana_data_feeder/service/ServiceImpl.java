package grafana_data_feeder.service;

import com.github.javafaker.Faker;
import grafana_data_feeder.model.Acquirer;
import grafana_data_feeder.model.Issuer;
import grafana_data_feeder.repository.GenericRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {

    @Autowired
    private AcquirerRepo acquirerRepo;

    @Autowired
    private IssuerRepo issuerRepo;

    Faker dummy = new Faker();

    int id[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};

    @Scheduled(cron = "*/10 * * * * *")
    public void loadData() {

        for (int i = 0; i < 16; i++) {

            Acquirer acquirer = acquirerRepo.findById(id[i]).get();
            acquirer.setFailureRate(dummy.number().randomDouble(2, 1, 99));
            acquirerRepo.save(acquirer);

            Issuer issuer = issuerRepo.findById(id[i]).get();
            issuer.setFailureRate(dummy.number().randomDouble(2, 1, 99));
            issuerRepo.save(issuer);


            //System.out.println(acquirer);
        }

    }

}
