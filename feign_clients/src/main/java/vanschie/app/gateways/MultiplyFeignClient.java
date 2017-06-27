package vanschie.app.gateways;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by carl on 24/06/17.
 */
@FeignClient(name = "multiplier")
public interface MultiplyFeignClient {

    @RequestMapping(method = RequestMethod.GET, value = "/multiply/{valueOne}/{valueTwo}")
    double multiply(@PathVariable("valueOne") double valueOne,
                    @PathVariable("valueTwo") double valueTwo);
}
