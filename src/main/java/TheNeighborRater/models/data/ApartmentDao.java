package TheNeighborRater.models.data;


import TheNeighborRater.models.Apartment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface ApartmentDao extends CrudRepository<Apartment, Integer> {
}
