package TheNeighborRater.models.data;

import TheNeighborRater.models.Review;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface ReviewDao extends CrudRepository<Review,Integer> {
}
