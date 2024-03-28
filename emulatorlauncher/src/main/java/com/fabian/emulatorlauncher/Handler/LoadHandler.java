package com.fabian.emulatorlauncher.Handler;

import com.fabian.emulatorlauncher.Datamodel.ConfigModel;
import com.fabian.emulatorlauncher.Datamodel.EmulatorModel;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class LoadHandler {
    List<EmulatorModel> emulatorModels = new LinkedList<>();

    public LoadHandler() {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(new ConfigModel().getDatabasePath()));
            String line = reader.readLine();
            line = reader.readLine();
            while (line != null) {
                String[] all = line.split(";");
                emulatorModels.add(new EmulatorModel(all[0], all[1], all[2]));
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<EmulatorModel> getEmulatorModels() {
        return emulatorModels;
    }
}
