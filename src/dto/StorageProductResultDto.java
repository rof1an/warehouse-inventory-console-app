package dto;

import java.util.List;

public class StorageProductResultDto {
    private String storageName;
    private List<StorageProductItemDto> items;

    public StorageProductResultDto(String storageName, List<StorageProductItemDto> items) {
        this.storageName = storageName;
        this.items = items;
    }

    public String getStorageName() {
        return storageName;
    }

    public List<StorageProductItemDto> getItems() {
        return items;
    }

    public void setStorageName(String storageName) {
        this.storageName = storageName;
    }

    public void setItems(List<StorageProductItemDto> items) {
        this.items = items;
    }
}
