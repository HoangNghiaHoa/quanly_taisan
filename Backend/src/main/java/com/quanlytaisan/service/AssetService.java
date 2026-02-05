package com.quanlytaisan.service;

import com.quanlytaisan.dto.AssetDTO;
import java.util.List;
public interface AssetService {
    List<AssetDTO> getAllAsset();
    AssetDTO createAsset(AssetDTO assetDTO);
    void deleteAsset(Long id);
    AssetDTO updateAsset(Long id, AssetDTO assetDTO);
}
