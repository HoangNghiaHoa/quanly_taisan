package com.quanlytaisan.controller;

import com.quanlytaisan.dto.AssetDTO;
import com.quanlytaisan.service.AssetService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/asset")
@CrossOrigin("*")
@Tag(name = "Asset Controller", description = "Quản lý danh sách công cụ dụng cụ")
public class AssetController {
    private final AssetService assetService;
//Create Asset
    @Operation(summary = "Thêm mới một tài sản", description = "Dữ liệu gửi lên dạng JSON không bao gồm ID")
    @PostMapping
    public AssetDTO createAsset(@RequestBody AssetDTO assetDTO){
        return assetService.createAsset(assetDTO);
    }
//Get AllAsset
    @Operation(summary = "Lấy danh sách tất cả tài sản", description = "Trả về danh sách tài sản kèm tên phòng ban quản lý")
    @GetMapping
    public List<AssetDTO> getAllAsset(){
        return assetService.getAllAsset();
    }
//Delete Asset by Id
    @Operation(summary = "Xóa tài sản theo ID")
    @DeleteMapping("{id}")
    public void deleteAsset(@PathVariable Long id){
        assetService.deleteAsset(id);
    }
//Update Asset by Id
    @Operation(summary = "Cập nhật tài sản", description = "Truyền ID trên đường dẫn và dữ liệu mới trong Body")
    @PutMapping("{id}")
    public AssetDTO updateAsset(@PathVariable Long id, @RequestBody AssetDTO assetDTO){
        return assetService.updateAsset(id, assetDTO);
    }
}
