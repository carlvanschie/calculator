package app.controllers;

import app.gateways.MultiplyFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping("/power/{firstValue}/{secondValue}")
    public double power(@PathVariable double firstValue,
                        @PathVariable double secondValue) {
        double result = firstValue;
        for(int index = 1; index < secondValue; index++) {
            result = multiplyFeignClient.multiply(result, firstValue);
        }
        return result;
    }
}
