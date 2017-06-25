package vanschie.app.controllers;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import vanschie.app.controllers.HttpController;
import vanschie.app.gateways.MultiplyFeignClient;

/**
 * Created by carl on 24/06/17.
 */
public class HttpControllerTest {

    @Test
    public void power() throws Exception {
        MultiplyFeignClient multiplyFeignClient = Mockito.mock(MultiplyFeignClient.class);
        Mockito.when(multiplyFeignClient.multiply(3,3)).thenReturn(9d);
        Mockito.when(multiplyFeignClient.multiply(9,3)).thenReturn(27d);

        HttpController controller = new HttpController(multiplyFeignClient);

        Assert.assertEquals(27, controller.power(3,3), 0);
    }

}