
package RestaurantReservation.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@FeignClient(name="admin03-owner", url="http://admin03-owner:8080")
/*@FeignClient(name="Owner", url="http://localhost:8082") */
public interface OwnerService {

    @RequestMapping(method= RequestMethod.POST, path="/postOwners") //여기가 POST로 안되어있어서 안된거같아요 다시 한번 이렇게 적용해서 빌드해보실래요?넵.
    public void checkReservation(@RequestBody Owner owner);

}