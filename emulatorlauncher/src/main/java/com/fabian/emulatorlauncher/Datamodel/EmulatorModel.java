package com.fabian.emulatorlauncher.Datamodel;

public class EmulatorModel {

    String name;
    String exeFilePath;
    String SaveFolderPath;

    public EmulatorModel() {
    }

    public EmulatorModel(String name, String exeFilePath, String saveFolderPath) {
        this.name = name;
        this.exeFilePath = exeFilePath;
        SaveFolderPath = saveFolderPath;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExeFilePath() {
        return exeFilePath;
    }

    public void setExeFilePath(String exeFilePath) {
        this.exeFilePath = exeFilePath;
    }

    public String getSaveFolderPath() {
        return SaveFolderPath;
    }

    public void setSaveFolderPath(String saveFolderPath) {
        SaveFolderPath = saveFolderPath;
    }

    @Override
    public String toString() {
        return name;
    }
}
