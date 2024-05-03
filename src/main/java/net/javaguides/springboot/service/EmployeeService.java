package net.javaguides.springboot.service;

import net.javaguides.springboot.dto.EmployeeDto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface EmployeeService {

    Mono<EmployeeDto> saveEmployee(EmployeeDto employeeDto);

    Mono<EmployeeDto> getEmployeeById(String id);

    Flux<EmployeeDto> getAllEmployees();

    Mono<EmployeeDto> updateEmployee(String id, EmployeeDto employeeDto);

    Mono<Void> deleteEmployee(String id);
}
