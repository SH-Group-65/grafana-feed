package grafana_data_feeder.service;

import grafana_data_feeder.model.Issuer;
import grafana_data_feeder.repository.GenericRepo;
import org.springframework.stereotype.Repository;

@Repository
public interface IssuerRepo extends GenericRepo<Issuer> {
}
