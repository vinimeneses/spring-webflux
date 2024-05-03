package net.javaguides.springboot.controller;

import lombok.AllArgsConstructor;
import net.javaguides.springboot.dto.EmployeeDto;
import net.javaguides.springboot.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/employees")
@AllArgsConstructor
public class EmployeeController {

    private EmployeeService employeeService;

    // Build Reactive Save employee REST API
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Mono<EmployeeDto> saveEmployee(@RequestBody EmployeeDto employeeDto) {
        return employeeService.saveEmployee(employeeDto);
    }

    // Build Reactive Get employee by id REST API
    @GetMapping("/{id}")
    public Mono<EmployeeDto> getEmployeeById(@PathVariable String id) {
        return employeeService.getEmployeeById(id);
    }

    // Build Reactive Get All employees REST API
    @GetMapping
    public Flux<EmployeeDto> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    // Build Reactive Update employee REST API
    @PutMapping("/{id}")
    public Mono<EmployeeDto> updateEmployee(@PathVariable String id, @RequestBody EmployeeDto employeeDto) {
        return employeeService.updateEmployee(id, employeeDto);
    }

    // Build Reactive Delete employee REST API
    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public Mono<Void> deleteEmployee(@PathVariable String id) {
        return employeeService.deleteEmployee(id);
    }
}
