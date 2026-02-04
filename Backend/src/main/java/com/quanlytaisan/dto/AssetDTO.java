package com.quanlytaisan.dto;
 import lombok.Data;
 import lombok.NoArgsConstructor;
 import lombok.AllArgsConstructor;

 @Data
 @AllArgsConstructor
 @NoArgsConstructor
public class AssetDTO {
     private Long id;
     private String name;
     private String serialNumber;
     private Integer quantity;
     private String unit;
     private Integer mfgYear;    // Năm sản xuất
     private Integer usageYear;  // Năm sử dụng
     private String origin;      // Xuất xứ
     private String brand;       // Nhãn hiệu
     private String modelCode;   // Mã hiệu
     private String capacity;    // Công suất
     private String status;      // Trạng thái
     private String demand;      // Nhu cầu
     private String notes;       // Ghi chú

     // This field is important : take name department from Object Department to show directly
     private String departmentName;

 }
