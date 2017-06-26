package vanschie.app.gateways;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by carl on 24/06/17.
 */
@FeignClient(name = "square", url = "localhost:10005")
public interface SquareFeignClient {

    @RequestMapping(method = RequestMethod.GET, path = "/square/{firstValue}")
    double square(@PathVariable("valueOne") double valueOne);
}
