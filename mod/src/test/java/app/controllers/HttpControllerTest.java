package app.controllers;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by carl on 25/06/17.
 */
public class HttpControllerTest {

    @Test
    public void mod() throws Exception {
        HttpController controller = new HttpController();
        assertEquals(controller.mod(8,3), 2, 0);
    }
}