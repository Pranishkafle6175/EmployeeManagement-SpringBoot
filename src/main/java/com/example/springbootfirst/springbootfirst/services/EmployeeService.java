package com.example.springbootfirst.springbootfirst.services;

import com.example.springbootfirst.springbootfirst.dto.EmployeeDTO;
import com.example.springbootfirst.springbootfirst.entities.EmployeeEntity;
import com.example.springbootfirst.springbootfirst.repositories.EmployeeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    final EmployeeRepository employeeRepository;
    final ModelMapper modelMapper;

    public EmployeeService(EmployeeRepository employeeRepository, ModelMapper modelMapper) {
        this.employeeRepository = employeeRepository;
        this.modelMapper = modelMapper;
    }


    public EmployeeDTO getEmployeeById(Long id){
        EmployeeEntity employeeEntity= employeeRepository.getById(id);
        return modelMapper.map(employeeEntity,EmployeeDTO.class);
    }

    public EmployeeDTO createNewEmployee(EmployeeDTO employeeDTO){
        EmployeeEntity employeeEntity= modelMapper.map(employeeDTO,EmployeeEntity.class);
        return modelMapper.map(employeeRepository.save(employeeEntity),EmployeeDTO.class);
    }

    public boolean deleteEmployeeById(Long employeeId) {
        boolean isPresent= employeeRepository.existsById(employeeId);
        if(!isPresent) return false;
        employeeRepository.deleteById(employeeId);
        return true;


    }
}
