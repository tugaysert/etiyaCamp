import java.util.List;

public class LoggerHelper implements ILoggerHelper<Employee, Logger> {


    @Override
    public void runLoggers(Employee employee, List<Logger> loggers) {
        loggers.forEach(l -> l.log(employee.getFirstName()));
    }
}
