package com.fabian.emulatorlauncher.Controller;

import com.fabian.emulatorlauncher.Datamodel.EmulatorModel;
import com.fabian.emulatorlauncher.Handler.BackupHandler;
import javafx.application.Platform;
import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class ListMenuPageController {

    @FXML
    private Button LaunchButton;
    @FXML
    private Button BackupButton;
    @FXML
    private ListView<EmulatorModel> ListOfEmulators;

    List<EmulatorModel> emulatorModels = new LinkedList<>();

    @FXML
    public void initialize() {
        BackupButton.styleProperty().bind(Bindings.when(BackupButton.hoverProperty())
                .then("-fx-background-color: #e69e6d")
                .otherwise("-fx-background-color: #a8a8a7"));
        LaunchButton.styleProperty().bind(Bindings.when(LaunchButton.hoverProperty())
                .then("-fx-background-color: #e69e6d")
                .otherwise("-fx-background-color: #a8a8a7"));
    }

    @FXML
    public void LaunchButton(MouseEvent mouseEvent) throws IOException {
        ListOfEmulators.getSelectionModel().getSelectedItem();
        Runtime runTime = Runtime.getRuntime();
        runTime.exec(emulatorModels.get(ListOfEmulators.getSelectionModel().getSelectedIndex()).getExeFilePath());
        Platform.exit();
    }

    @FXML
    public void BackupButton(MouseEvent mouseEvent) {
        new BackupHandler(emulatorModels);
        System.out.println("Ready");
        //TODO maybe add a pop up or some other marker that the task has finished
    }

    public void initList(List<EmulatorModel> emulatorModels) {
        this.emulatorModels = emulatorModels;
        for (EmulatorModel emulatorModel : emulatorModels) {
            ListOfEmulators.getItems().add(emulatorModel);
        }
    }
}
