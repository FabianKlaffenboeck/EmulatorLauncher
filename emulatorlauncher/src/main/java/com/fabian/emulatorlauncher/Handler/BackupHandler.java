package com.fabian.emulatorlauncher.Handler;

import com.fabian.emulatorlauncher.Datamodel.ConfigModel;
import com.fabian.emulatorlauncher.Datamodel.EmulatorModel;
import com.fabian.emulatorlauncher.Tasks.ZipTask;

import java.io.File;
import java.util.List;

public class BackupHandler {

    public BackupHandler(List<EmulatorModel> emulatorModels) {

        File theDir = new File(new ConfigModel().getBackupDesFolder());
        if (!theDir.exists()) {
            theDir.mkdirs();
        }

        File path = new File(new ConfigModel().getBackupDesFolder() + "/" + determineBackupNum());
        for (EmulatorModel emulatorModel : emulatorModels) {
            new ZipTask(new File(emulatorModel.getSaveFolderPath()), path, emulatorModel.getName() + "_Backup");
        }
    }

    String determineBackupNum() {
        String BackupNum = "Backup_";
        int BackupNumModifier = 0;

        File theDir = new File(new ConfigModel().getBackupDesFolder() + "/" + BackupNum + BackupNumModifier);
        while (theDir.exists()) {
            BackupNumModifier++;
            theDir = new File(new ConfigModel().getBackupDesFolder() + "/" + BackupNum + BackupNumModifier);
        }

        theDir.mkdirs();
        return BackupNum + BackupNumModifier;
    }
}
