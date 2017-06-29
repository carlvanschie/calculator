package app.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by carl on 23/06/17.
 */
@RestController
public class HttpController {

    @RequestMapping("/divide/{firstValue}/{secondValue}")
    public double divide(@PathVariable double firstValue,
                         @PathVariable double secondValue) {
        return firstValue / secondValue;
    }
}
