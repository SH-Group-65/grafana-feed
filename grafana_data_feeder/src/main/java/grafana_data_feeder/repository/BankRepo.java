package grafana_data_feeder.repository;

import grafana_data_feeder.model.Bank;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankRepo extends CrudRepository<Bank, Integer> {

}
