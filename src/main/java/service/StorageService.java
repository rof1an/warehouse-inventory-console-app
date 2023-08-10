package service;

import models.Storage;
import repository.StorageRepository;
import java.util.List;
import java.util.Optional;

public class StorageService {
    private StorageRepository storageRepository = new StorageRepository();

    public List<Storage> getStorages() {
        return storageRepository.getStorages();
    }

    public Optional<Storage> getStorageById(int id){
        return storageRepository.getStorageById(id);
    }

    public void addNewStorage(String name, String location) {
        storageRepository.addNewStorage(name, location);
    }
}
