import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Logger logger = new CloudLogger();
        logger.log("adsasd");

        CustomerManager customerManager = new CustomerManager(logger);
        customerManager.add(new Customer());

        EmployeeManager employeeManager = new EmployeeManager(Arrays.asList(new DatabaseLogger(), new CloudLogger(), new ElasticLogger()));
        employeeManager.add(new Employee());
    }
}
