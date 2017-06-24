package vanschie.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vanschie.app.gateways.MultiplyFeignClient;

/**
 * Created by carl on 23/06/17.
 */
@RestController
public class HttpController {

    private final MultiplyFeignClient multiplyFeignClient;

    @Autowired
    public HttpController(MultiplyFeignClient multiplyFeignClient) {
        this.multiplyFeignClient = multiplyFeignClient;
    }

    @RequestMapping("/square/{firstValue}")
    public double square(@PathVariable double firstValue) {
        return multiplyFeignClient.multiply(firstValue, firstValue);
    }
}
