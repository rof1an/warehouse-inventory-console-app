package models;

import java.util.ArrayList;

public class Storage {
    int storageId;
    String storageName;
    String storageLocation;

    public Storage(String storageName, String storageLocation, int storageId) {
        this.storageId = storageId;
        this.storageLocation = storageLocation;
        this.storageName = storageName;
    }

    public String getStorageName() {
        return storageName;
    }

    public void setStorageName(String name) {
        storageName = name;
    }

    public String getStorageLocation() {
        return storageLocation;
    }

    public void setStorageLocation(String location) {
        this.storageLocation = location;
    }

    public int getStorageId() { return storageId; }

    public void setStorageId(int storageId) {
        this.storageId = storageId;
    }
}
