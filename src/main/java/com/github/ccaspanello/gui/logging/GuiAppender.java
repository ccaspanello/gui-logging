/**
 * Copyright 2016 Chris Caspanello
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.ccaspanello.gui.logging;

import javafx.scene.control.TextArea;
import org.apache.log4j.WriterAppender;
import org.apache.log4j.spi.LoggingEvent;

/**
 * GUI Appender
 * <p>
 * Log5J Appender implementation that writes to a textArea widget.
 * <p>
 * Created by ccaspanello on 9/8/2016.
 */
public class GuiAppender extends WriterAppender {

    private static volatile TextArea textArea;

    public static void setTextArea(TextArea textArea) {
        GuiAppender.textArea = textArea;
    }

    @Override
    public void append(final LoggingEvent loggingEvent) {
        String message = this.layout.format(loggingEvent);
        if (textArea != null) {
            textArea.selectEnd();
            textArea.insertText(textArea.getText().length(), message);
        }
    }
}