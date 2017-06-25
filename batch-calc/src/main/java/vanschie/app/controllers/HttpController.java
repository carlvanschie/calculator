package vanschie.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vanschie.app.domain.Calculation;
import vanschie.app.gateways.MultiplyFeignClient;

import java.util.ArrayList;
import java.util.List;

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

    private Calculation process(Calculation calculation) {

        if(calculation.getCalculationType().equals("ADD")) {

        } else if(calculation.getCalculationType().equals("SUB")) {

        } else if(calculation.getCalculationType().equals("MUL")) {
            calculation.setResult(multiplyFeignClient.multiply(calculation.getFirstValue(), calculation.getSecondValue()));
        } else if(calculation.getCalculationType().equals("DIV")) {

        } else if(calculation.getCalculationType().equals("MOD")) {

        } else if(calculation.getCalculationType().equals("SQU")) {

        }
        return calculation;
    }
}
