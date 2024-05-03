package net.javaguides.springboot.service.impl;

import lombok.AllArgsConstructor;
import net.javaguides.springboot.dto.EmployeeDto;
import net.javaguides.springboot.entity.Employee;
import net.javaguides.springboot.mapper.EmployeeMapper;
import net.javaguides.springboot.repository.EmployeeRepository;
import net.javaguides.springboot.service.EmployeeService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Override
    public Mono<EmployeeDto> saveEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Mono<Employee> savedEmployee = employeeRepository.save(employee);
        return savedEmployee.map(EmployeeMapper::mapToEmployeeDto);
    }

    @Override
    public Mono<EmployeeDto> getEmployeeById(String id) {
        Mono<Employee> employee = employeeRepository.findById(id);
        return employee.map(EmployeeMapper::mapToEmployeeDto);
    }

    @Override
    public Flux<EmployeeDto> getAllEmployees() {
        Flux<Employee> savedEmployee = employeeRepository.findAll();
        return savedEmployee.map(EmployeeMapper::mapToEmployeeDto);
    }

    @Override
    public Mono<EmployeeDto> updateEmployee(String id, EmployeeDto employeeDto) {
        Mono<Employee> employee = employeeRepository.findById(id);

        employee.flatMap((existingEmployee) -> {
            existingEmployee.setFirstName(employeeDto.getFirstName());
            existingEmployee.setLastName(employeeDto.getLastName());
            existingEmployee.setEmail(employeeDto.getEmail());
            return employeeRepository.save(existingEmployee);
        });
        return employee.map(EmployeeMapper::mapToEmployeeDto);
    }

    @Override
    public Mono<Void> deleteEmployee(String id) {
        return employeeRepository.deleteById(id);
    }
}
