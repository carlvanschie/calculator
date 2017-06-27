package vanschie.app.gateways;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by carl on 24/06/17.
 */
@FeignClient(name = "power", url = "localhost:10007")
public interface PowerFeignClient {

    @RequestMapping(method = RequestMethod.GET, value = "/power/{valueOne}/{valueTwo}")
    double power(@PathVariable("valueOne") double valueOne,
                 @PathVariable("valueTwo") double valueTwo);
}