package repository;

import models.Storage;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StorageRepository {
    private static ArrayList<Storage> storageList = initializeData();

    public static ArrayList<Storage> initializeData(){
        ArrayList<Storage> list = new ArrayList<>();
        list.add(new models.Storage("Южный", "Москва", 1));
        list.add(new models.Storage("Запад", "15-13-16", 2));
        return list;
    }

    public List<Storage> getStorages(){
        return storageList;
    }

    public Optional<Storage> getStorageById(int id){
        return storageList.stream()
                .filter(st -> st.getStorageId() == id)
                .findFirst();
    }

    public void addNewStorage(String name, String location, int id){
        storageList.add(new Storage(name, location, id));
    }
}


