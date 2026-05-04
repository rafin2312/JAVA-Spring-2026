import java.util.HashMap;
import java.util.Map;

public class HashMapTask {
    HashMap<Integer, Double> employeeData = new HashMap<>();

    public HashMapTask() {
        employeeData.put(1, 5000.0);
        employeeData.put(2, 200.0);
        employeeData.put(3, 3000.0);
        employeeData.put(4, 4000.0);
        employeeData.put(5, 50000.0);
    }
    public double findAverageSalary() {
        double sum = 0;
        for(double salary : employeeData.values()){
            sum += salary;
        }
        return sum/employeeData.size();
    }
    public void show(){
        System.out.println("Employee Data:");
        for(Map.Entry<Integer, Double> entry : employeeData.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("Average Salary: " + findAverageSalary());
    }
}