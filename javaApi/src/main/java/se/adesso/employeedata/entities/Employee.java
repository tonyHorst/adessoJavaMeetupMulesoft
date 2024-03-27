package se.adesso.employeedata.entities;

import lombok.Data;

import java.util.UUID;

@Data
public class Employee {
    private UUID id;
    private String name;
    private String familyName;
    private String gender;
    private boolean management;
}
