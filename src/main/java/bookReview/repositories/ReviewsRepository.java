package bookReview.repositories;

import bookReview.model.Reviews;
import org.springframework.data.repository.CrudRepository;

public interface ReviewsRepository extends CrudRepository<Reviews, Integer> {

}