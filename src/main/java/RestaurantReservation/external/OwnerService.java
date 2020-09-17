
package RestaurantReservation.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@FeignClient(name="admin03-owner", url="http://admin03-owner:8080")
/*@FeignClient(name="Owner", url="http://localhost:8082") */
public interface OwnerService {

    @RequestMapping(method= RequestMethod.GET, path="/postOwners")
    public void checkReservation(@RequestBody Owner owner);

}