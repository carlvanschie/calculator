package vanschie.app.gateways;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by carl on 24/06/17.
 */
@FeignClient(name = "mod", url = "localhost:10007")
public interface ModFeignClient {

    @RequestMapping(method = RequestMethod.GET, path = "/mod/{valueOne}/{valueTwo}")
    double mod(@PathVariable("valueOne") double valueOne,
               @PathVariable("valueTwo") double valueTwo);
}
