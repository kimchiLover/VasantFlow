package com.adi.dept;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DeptServiceImpl implements DeptService {

    //@Autowired
    private DeptRepository deptRepository;

    @Override
    @Transactional
    public int getDeptIdByName(String dept_name) {
        return Integer.parseInt(deptRepository.getDeptIdByName(dept_name));
    }
}