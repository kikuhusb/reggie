package com.sonder.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sonder.Entity.Employee;
import com.sonder.mapper.EmployeeMapper;
import com.sonder.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper,Employee> implements EmployeeService {

}
