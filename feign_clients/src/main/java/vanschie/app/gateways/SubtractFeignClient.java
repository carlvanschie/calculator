package vanschie.app.gateways;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by carl on 24/06/17.
 */
@FeignClient(name = "subtract", url = "localhost:10002")
public interface SubtractFeignClient {

    @RequestMapping(method = RequestMethod.GET, path = "/subtract/{firstValue}/{secondValue}")
    double subtract(@PathVariable("valueOne") double valueOne,
                    @PathVariable("valueTwo") double valueTwo);
}
