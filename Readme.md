# Dự Án Quản Lý Tài Sản Công Ty

Hệ thống quản lý Công cụ dụng cụ (CCDC) tập trung cho 9 phòng ban trong công ty.

## 📂 Cấu trúc dự án (Monorepo)
- **/Backend**: Mã nguồn Java Spring Boot (Xử lý logic và Database).
- **/Frontend**: Mã nguồn giao diện (FE).

## 🛠 Công nghệ sử dụng
- **Backend**: Java 17, Spring Boot 3.4.2, Spring Data JPA, MySQL,MapStruct** (Mapping DTO & Entity), **Lombok** (Giảm thiểu boilerplate code)**Swagger/OpenAPI** (Tài liệu API)
- **Frontend**: (Đang cập nhật).

## 📊 Mô tả Cơ sở dữ liệu
Hệ thống quản lý tài sản với các thuộc tính chính:
- Tên CCDC, Serial Number, Số lượng, ĐVT.
- Năm sản xuất, Năm sử dụng, Nước/Hãng sản xuất.
- Công suất, Hiện trạng, Nhu cầu sử dụng.

## 🛠 Hướng dẫn cài đặt
1. Clone dự án: `git clone [link-github-cua-ban]`
2. Cấu hình database trong file `src/main/resources/application.properties`.
3. Chạy lệnh: `mvn spring-boot:run` hoặc chạy trực tiếp từ IntelliJ.
4. Truy cập Swagger UI để xem danh sách API: `http://localhost:8081/swagger-ui.html`
