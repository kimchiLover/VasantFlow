package com.adi.dept;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeptRepository extends JpaRepository< Dept,Long> {
    String getDeptIdByName(@Param("searchName") String dept_name);
}
