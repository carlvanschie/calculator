package app.controllers;

import app.gateways.MultiplyFeignClient;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by carl on 24/06/17.
 */
public class HttpControllerTest {

    @Test
    public void power() throws Exception {
        MultiplyFeignClient multiplyFeignClient = mock(MultiplyFeignClient.class);
        when(multiplyFeignClient.multiply(3,3)).thenReturn(9d);
        when(multiplyFeignClient.multiply(9,3)).thenReturn(27d);

        HttpController controller = new HttpController(multiplyFeignClient);

        assertEquals(27, controller.power(3,3), 0);

    }

}