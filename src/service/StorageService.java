package service;

import models.Storage;
import repository.StorageRepository;
import java.util.List;

public class StorageService {
    private StorageRepository storageRepository = new StorageRepository();

    public List<Storage> getStorages() {
        return storageRepository.getStorages();
    }

    public void addNewStorage(String name, String location, int id) {
        storageRepository.addNewStorage(name, location, id);
    }
}
