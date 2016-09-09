package com.github.ccaspanello.gui.logging;

import javafx.scene.control.TextArea;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Hello World Appender Test
 *
 * Created by ccaspanello on 9/8/2016.
 */
public class HelloWorldControllerTest extends MainApplicationTest {

    private static HelloWorldController controller;

    @Before
    public void setup() {
        super.setup();
        controller = new HelloWorldController();
        controller.initialize(null, null);
    }

    @Test
    public void testTrace() {
        TextArea textArea = new TextArea();
        GuiAppender.setTextArea(textArea);
        controller.trace(null);
        assertTrue(textArea.getText().contains("TRACE"));
        assertTrue(textArea.getText().contains("trace(event: null)"));
    }

    @Test
    public void testInfo() {
        TextArea textArea = new TextArea();
        GuiAppender.setTextArea(textArea);
        controller.info(null);
        assertTrue(textArea.getText().contains("INFO"));
        assertTrue(textArea.getText().contains("info(event: null)"));
    }

    @Test
    public void testWarn() {
        TextArea textArea = new TextArea();
        GuiAppender.setTextArea(textArea);
        controller.warn(null);
        assertTrue(textArea.getText().contains("WARN"));
        assertTrue(textArea.getText().contains("warn(event: null)"));
    }

    @Test
    public void testDebug() {
        TextArea textArea = new TextArea();
        GuiAppender.setTextArea(textArea);
        controller.debug(null);
        assertTrue(textArea.getText().contains("DEBUG"));
        assertTrue(textArea.getText().contains("debug(event: null)"));
    }

    @Test
    public void testError() {
        TextArea textArea = new TextArea();
        GuiAppender.setTextArea(textArea);
        controller.error(null);
        assertTrue(textArea.getText().contains("ERROR"));
        assertTrue(textArea.getText().contains("error(event: null)"));
    }
}
