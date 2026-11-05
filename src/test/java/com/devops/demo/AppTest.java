package com.devops.demo;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testGetMessage() {
        App app = new App();
        assertEquals("Jenkins Maven Build Successful",
                     app.getMessage());
    }
}
