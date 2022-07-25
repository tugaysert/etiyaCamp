import java.util.List;

public class EmployeeManager {
    private final List<Logger> loggers;
    private final ILoggerHelper iLoggerHelper;


    public EmployeeManager(List<Logger> loggers, ILoggerHelper iLoggerHelper) {
        this.loggers = loggers;
        this.iLoggerHelper = iLoggerHelper;
    }

    public void add(Employee employee) {
        iLoggerHelper.runLoggers(employee, loggers);
        System.out.println("employee added.");
    }



}
