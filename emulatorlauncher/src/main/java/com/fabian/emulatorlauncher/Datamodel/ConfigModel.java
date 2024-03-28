package com.fabian.emulatorlauncher.Datamodel;

public class ConfigModel {
    //String BackupDesFolder = "C:\\Users\\Fabian\\Desktop\\Backup";
    //String DatabasePath = "C:\\Users\\Fabian\\Desktop\\Emulation\\Database.csv";
    String BackupDesFolder = "..\\__Backups";
    String DatabasePath = "..\\Database.csv";


    public String getBackupDesFolder() {
        return BackupDesFolder;
    }

    public void setBackupDesFolder(String backupDesFolder) {
        BackupDesFolder = backupDesFolder;
    }

    public String getDatabasePath() {
        return DatabasePath;
    }

    public void setDatabasePath(String databasePath) {
        DatabasePath = databasePath;
    }
}
