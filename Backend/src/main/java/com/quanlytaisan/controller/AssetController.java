package com.quanlytaisan.controller;

import com.quanlytaisan.dto.AssetDTO;
import com.quanlytaisan.service.AssetService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/asset")
@CrossOrigin("*")
public class AssetController {
    private final AssetService assetService;

    @GetMapping
    public List<AssetDTO> getAllAsset(){
        return assetService.getAllAsset();
    }
}
