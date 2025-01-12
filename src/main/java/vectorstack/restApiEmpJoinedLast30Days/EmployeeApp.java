package vectorstack.restApiEmpJoinedLast30Days;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class EmployeeApp {

    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee(1L,"Alice", LocalDate.of(2025, 1, 1)),
                new Employee(2L,"Bob", LocalDate.of(2024, 10, 10)),
                new Employee(3L,"Charlie", LocalDate.of(2024, 12, 25)),
                new Employee(4L,"David", LocalDate.of(2024, 9, 15))
        );

        EmployeeService employeeService = new EmployeeService(employeeList);

        List<Employee> recentEmployees = employeeService.getRecentEmployees();

        recentEmployees.forEach(System.out::println);
    }
}
