package com.gsbe.gsbackend_project.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private int ID;
    private String userName;
    private String dateOfBirth;
    private String address;
}
