package se.adesso.employeedata.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import se.adesso.employeedata.entities.Employee;

import java.io.IOException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final ObjectMapper objectMapper;
    @Value("classpath:data/employees.json")
    private Resource resourceFile;

    public List<Employee> getAll() throws IOException {
        return objectMapper.readValue(resourceFile.getFile(), new TypeReference<>() {
        });
    }
}
