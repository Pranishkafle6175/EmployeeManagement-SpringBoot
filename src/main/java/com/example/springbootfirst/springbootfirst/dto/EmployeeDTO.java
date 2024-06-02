package com.example.springbootfirst.springbootfirst.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
//Data will generate all getter setter
@Data
@AllArgsConstructor
@NoArgsConstructor

public class EmployeeDTO {
    private long id;
    private String name;
    private LocalDate DateOfJoining;
    @JsonProperty("isActive")
    private boolean isActive;

}
