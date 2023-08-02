package service;

import dto.StorageDto;
import dto.StorageProductResultDto;
import models.Product;
import models.Storage;
import models.StorageProduct;
import repository.ProductRepository;
import repository.StorageProductRepository;
import repository.StorageRepository;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StorageProductService {
    private StorageProductRepository storageProductRepository = new StorageProductRepository();
    private StorageRepository storageRepository = new StorageRepository();
    private ProductRepository productRepository = new ProductRepository();

    public List<StorageProduct> getProductsInStorages(){
        return StorageProductRepository.getProductsInStorages();
    }

    public List getProductStorageList(){
        List storageProduct = getProductsInStorages().stream()
                .map(ps -> {
                    Optional<Storage> storage = storageRepository.getById(ps.getStorageId());
                    Optional<Product> product = productRepository.getById(ps.getProductId());
                    return storage;
                })
                .collect(Collectors.toList());

        return storageProduct;
    }
}
