package com.example.webxemaydien.repository;

import com.example.webxemaydien.entity.TaiKhoan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaiKhoanRepository extends JpaRepository<TaiKhoan, Long> {
    // Define the query method to find by tenTK and matKhau
    TaiKhoan findByTenTKAndMatKhau(String tenTK, String matKhau);
}
