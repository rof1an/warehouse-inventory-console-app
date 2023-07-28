package repository;

import models.Storage;
import java.util.ArrayList;
import java.util.List;

public class StorageRepository {
    private static ArrayList<Storage> storageList = initializeData();

    public static ArrayList<Storage> initializeData(){
        ArrayList<Storage> list = new ArrayList<>();
        list.add(new models.Storage("Южный", "Москва", 1));
        list.add(new models.Storage("Западный", "Питер", 2));
        return list;
    }

    public List<Storage> getStorages(){
        return storageList;
    }
}
