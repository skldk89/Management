package RestaurantReservation;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ManagementRepository extends CrudRepository<Management, Long> {


}