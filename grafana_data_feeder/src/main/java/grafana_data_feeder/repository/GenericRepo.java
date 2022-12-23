package grafana_data_feeder.repository;

import grafana_data_feeder.model.Acquirer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

//@Repository
@NoRepositoryBean
public interface GenericRepo<T> extends CrudRepository<T, Integer> {

}
