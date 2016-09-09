package com.github.ccaspanello.gui.logging;

import javafx.application.Application;
import org.junit.Before;

/**
 * Main Application Abstract Test
 * <p>
 * This class instantiates the JavaFX application in a thread so we can make controller calls with @FXML annotated
 * fields.
 * <p>
 * Created by ccaspanello on 9/8/2016.
 */
public abstract class MainApplicationTest {

    private static Thread t;

    @Before
    public void setup() {
        if (t == null) {
            t = new Thread("JavaFX Init Thread") {
                public void run() {
                    Application.launch(MainApplication.class, new String[0]);
                }
            };
            t.setDaemon(true);
            t.start();
        }
    }
}
