package com.github.ccaspanello.gui.logging;

import javafx.scene.control.TextArea;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * GUI Appender Test
 *
 * Created by ccaspanello on 9/8/2016.
 */
public class GuiAppenderTest extends MainApplicationTest {

    private static final Logger LOG = LoggerFactory.getLogger(GuiAppenderTest.class);

    @Test
    public void testAppend(){
        TextArea textArea = new TextArea();
        GuiAppender.setTextArea(textArea);
        assertEquals(textArea.getText(), "");

        LOG.info("test");
        assertTrue(textArea.getText().contains("INFO"));
        assertTrue(textArea.getText().contains("test"));
    }
}
