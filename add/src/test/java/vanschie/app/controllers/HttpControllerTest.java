package vanschie.app.controllers;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by carl on 23/06/17.
 */
public class HttpControllerTest {

    @Test
    public void add() throws Exception {
        HttpController controller = new HttpController();
        assertEquals(controller.add(2, 3), 5, 0);
    }
}