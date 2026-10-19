package q26;

public class Employee {

    // private attributes
    private String name;
    private int yearOfJoining;
    private double salary;
    private String address;

    // constructor to initialize employee details
    public Employee(String name, int yearOfJoining, double salary, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }

    // getter for name
    public String getName() {
        return name;
    }

    // getter for year of joining
    public int getYearOfJoining() {
        return yearOfJoining;
    }

    // getter for salary
    public double getSalary() {
        return salary;
    }

    // getter for address
    public String getAddress() {
        return address;
    }

    // method to display employee details in table format
    public void display() {
        System.out.printf("%-10s %-20d %-30s\n", name, yearOfJoining, address);
    }
}
