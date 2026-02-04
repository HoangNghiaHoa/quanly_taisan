package com.quanlytaisan.service;
 import com.quanlytaisan.dto.AssetDTO;
 import com.quanlytaisan.repository.AssetRepository;
 import com.quanlytaisan.mapper.AssetMapper;
 import lombok.RequiredArgsConstructor;
 import org.springframework.stereotype.Service;

 import java.util.List;
 import java.util.stream.Collectors;

 @Service
 @RequiredArgsConstructor
public class AssetServiceImpl implements  AssetService {

     private final AssetRepository assetRepository;
     private final AssetMapper assetMapper;


     @Override
     public List<AssetDTO> getAllAsset() {
         // Take all from DB -> to DTO by Mapper -> return list
         return assetRepository.findAll().stream()
                 .map(assetMapper ::toDTO)
                 .collect(Collectors.toList());
     }
 }
