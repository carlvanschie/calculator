package vanschie.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vanschie.app.domain.Calculation;
import vanschie.app.gateways.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by carl on 23/06/17.
 */
@RestController
public class HttpController {

    private final MultiplyFeignClient multiplyFeignClient;
    private final AddFeignClient addFeignClient;
    private final SubtractFeignClient subtractFeignClient;
    private final DivideFeignClient divideFeignClient;
    private final ModFeignClient modFeignClient;
    private final SquareFeignClient squareFeignClient;
    private final PowerFeignClient powerFeignClient;

    @Autowired
    public HttpController(MultiplyFeignClient multiplyFeignClient,
                          AddFeignClient addFeignClient,
                          SubtractFeignClient subtractFeignClient,
                          DivideFeignClient divideFeignClient,
                          ModFeignClient modFeignClient,
                          SquareFeignClient squareFeignClient,
                          PowerFeignClient powerFeignClient) {
        this.multiplyFeignClient = multiplyFeignClient;
        this.addFeignClient = addFeignClient;
        this.subtractFeignClient = subtractFeignClient;
        this.divideFeignClient = divideFeignClient;
        this.modFeignClient = modFeignClient;
        this.squareFeignClient = squareFeignClient;
        this.powerFeignClient = powerFeignClient;
    }

    @RequestMapping("/calculate")
    public Calculation calculate(@RequestBody Calculation calculation) {
        return this.process(calculation);
    }

    @RequestMapping("/calculate-multiple")
    public List<Calculation> calculate(@RequestBody List<Calculation> calculations) {
        List<Calculation> results = new ArrayList();
        for(Calculation calculation : calculations) {
            results.add(process(calculation));
        }
        return calculations;
    }

    private Calculation process(Calculation c) {

        if(c.getCalculationType().equals("ADD")) {
            c.setResult(addFeignClient.add(c.getFirstValue(), c.getSecondValue()));
        } else if(c.getCalculationType().equals("SUB")) {
            c.setResult(subtractFeignClient.subtract(c.getFirstValue(), c.getSecondValue()));
        } else if(c.getCalculationType().equals("MUL")) {
            c.setResult(multiplyFeignClient.multiply(c.getFirstValue(), c.getSecondValue()));
        } else if(c.getCalculationType().equals("DIV")) {
            c.setResult(divideFeignClient.divide(c.getFirstValue(), c.getSecondValue()));
        } else if(c.getCalculationType().equals("MOD")) {
            c.setResult(modFeignClient.mod(c.getFirstValue(), c.getSecondValue()));
        } else if(c.getCalculationType().equals("SQU")) {
            c.setResult(squareFeignClient.square(c.getFirstValue()));
        }
        return c;
    }
}
