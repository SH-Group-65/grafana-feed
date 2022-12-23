package grafana_data_feeder.service;

import grafana_data_feeder.model.Acquirer;
import grafana_data_feeder.repository.GenericRepo;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface AcquirerRepo extends GenericRepo<Acquirer> {
}
