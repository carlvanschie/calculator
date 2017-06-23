package app.controllers;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by carl on 23/06/17.
 */
public class HttpControllerTest {

    @Test
    public void subtract() throws Exception {
        HttpController controller = new HttpController();
        assertEquals(controller.subtract(10, 10), 0, 0);
    }
}