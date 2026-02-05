package com.quanlytaisan.repository;

import com.quanlytaisan.entity.Asset;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AssetRepository extends JpaRepository<Asset, Long> {
   @Query(value = "SELECT  a from Asset  a left join  fetch  a.department",
            countQuery = "SELECT  count(a) from Asset a")
   Page<Asset> findAllWithDepartment(Pageable pageable);
}