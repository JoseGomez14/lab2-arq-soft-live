package com.udea.lab2live;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Lab2liveApplicationTests {

    @Autowired
    private DataController dataController;

    @Test
    void healthCheck() {
        assert dataController.healthCheck().equals("APPLICATION WORKING: OK!");
    }

    @Test
    void version() {
        assert dataController.version().equals("ACTUAL VERSION: 1.0.0");
    }

    @Test
    void nations() {
        assert dataController.nations().size() == 20;
    }

    @Test
    void currencies() {
        assert dataController.currencies().size() == 20;
    }

    @Test
    void airlines() {
        assert dataController.airlines().size() == 20;
    }

}
