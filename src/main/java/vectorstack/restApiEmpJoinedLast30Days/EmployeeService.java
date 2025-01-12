package vectorstack.restApiEmpJoinedLast30Days;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService {

    private final List<Employee> employees;

    public EmployeeService(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> getRecentEmployees() {
        LocalDate thirdDaysAgo = LocalDate.now().minusDays(30);
        return employees.stream()
                .filter(e -> e.getDoj().isAfter(thirdDaysAgo))
                .collect(Collectors.toList());
    }
}
