package service;

import dto.StorageProductResultDto;
import models.Product;
import models.Storage;
import models.StorageProduct;
import repository.StorageProductRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StorageProductService {
    private StorageProductRepository storageProductRepository = new StorageProductRepository();
    private StorageService storageService = new StorageService();
    private ProductService productService = new ProductService();


    public List<StorageProduct> getProductsInStorages(){
        return StorageProductRepository.getProductsInStorages();
    }

    public Product getById(int id) {
        Optional<Product> product = productService.getById(id);
        return product.orElseThrow(() -> new RuntimeException("Product not found"));
    }

    public Storage getStorageById(int id){
        Optional<Storage> storage = storageService.getStorageById(id);
        return storage.orElseThrow(() -> new RuntimeException("Storage not found"));
    }

    public List<StorageProductResultDto> getProductStorageList(){
        List storageProduct = getProductsInStorages().stream()
                .map(ps -> {
                    Storage storage = getStorageById(ps.getStorageId());
                    Product product = getById(ps.getProductId());

                    return new StorageProductResultDto(storage, product, ps.getProductCount());
                })
                .collect(Collectors.toList());

        return storageProduct;
    }
}
