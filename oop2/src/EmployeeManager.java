import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    List<Logger> loggers;


    public EmployeeManager(List<Logger> loggers) {
        this.loggers = loggers;

    }

    public void add(Employee employee) {
        System.out.println("employee added.");
       loggers.forEach(l -> l.log(employee.getFirstName()));

    }


}
