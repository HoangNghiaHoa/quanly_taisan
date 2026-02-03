package com.quanlytaisan.repository;

import com.quanlytaisan.entity.Asset;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssetRepository extends JpaRepository<Asset, Long> {
    // Nơi đây sẽ giúp bạn tìm kiếm tài sản theo tên, seri, hoặc phòng ban sau này
}