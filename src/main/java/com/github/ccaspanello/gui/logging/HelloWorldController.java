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

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Hello World Controller
 * <p>
 * JavaFX GUI Controller that has logging buttons and logs appropriately to the console.
 * <p>
 * Created by ccaspanello on 9/8/2016.
 */
public class HelloWorldController implements Initializable {

    private static final Logger LOG = LoggerFactory.getLogger(HelloWorldController.class);

    @FXML
    private TextArea txtConsole;

    public void initialize(URL location, ResourceBundle resources) {
        GuiAppender.setTextArea(txtConsole);
    }

    @FXML
    public void trace(ActionEvent event) {
        LOG.trace("trace(event: {})", event);
    }

    @FXML
    public void info(ActionEvent event) {
        LOG.info("info(event: {})", event);
    }

    @FXML
    public void warn(ActionEvent event) {
        LOG.warn("warn(event: {})", event);
    }

    @FXML
    public void debug(ActionEvent event) {
        LOG.debug("debug(event: {})", event);
    }

    @FXML
    public void error(ActionEvent event) {
        LOG.error("error(event: {})", event);
    }

}
