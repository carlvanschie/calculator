package vanschie.app.controllers;

import org.junit.Test;
import vanschie.app.gateways.MultiplyFeignClient;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by carl on 24/06/17.
 */
public class HttpControllerTest {

    @Test
    public void testSquare() {
        MultiplyFeignClient multiplyFeignClient = mock(MultiplyFeignClient.class);
        when(multiplyFeignClient.multiply(4,4)).thenReturn(16d);
        HttpController controller = new HttpController(multiplyFeignClient);
        assertEquals(controller.square(4), 16, 0);
    }
}