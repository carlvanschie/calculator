package vanschie.app.gateways;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by carl on 24/06/17.
 */
@FeignClient(name = "add", url = "localhost:10001")
public interface AddFeignClient {

    @RequestMapping(method = RequestMethod.GET, path = "/add/{valueOne}/{valueTwo}")
    double add(@PathVariable("valueOne") double valueOne,
               @PathVariable("valueTwo") double valueTwo);
}
