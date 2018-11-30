package bookReview.repositories;

import bookReview.model.Quotes;
import org.springframework.data.repository.CrudRepository;

public interface QuotesRepository extends CrudRepository<Quotes, Integer> {

}
