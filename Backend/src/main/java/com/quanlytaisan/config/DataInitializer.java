package com.quanlytaisan.config;

import  com.quanlytaisan.entity.Department;
import com.quanlytaisan.repository.DepartmentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initDatabase(DepartmentRepository repository){
        return args -> {
            // Check if table Department has no data, input
            if (repository.count() ==0){
                List<String> Department = Arrays.asList(
                        "Ban Giám đốc","Phòng Kế toán - Tổng hợp","Phòng Phần mềm DV CNTT",
                        "Phòng Phần mềm DV GTGT","Phòng Kiểm thử phần mềm","Phòng Giải pháp Phần mềm",
                        "Trung tâm Phần mềm TP HCM","Trung tâm An ninh thông tin"," Phòng Phần mềm Dịch vụ Tài chính"
                );
                Department.forEach(name ->{
                    Department dept = new Department();
                    dept.setName(name);
                    repository.save(dept);
                });
                System.out.println(">>> Đã khởi tạo 9 phòng ban thành công vào Database!");
            }else{
                System.out.println(">> Dữ liệu phòng ban đã tồn tại, bỏ qua bước khởi tạo.");
            }

        };
    }

}
