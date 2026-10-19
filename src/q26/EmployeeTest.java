package q26;

public class EmployeeTest {

    // main method to run and test employee details
    public static void main(String[] args) {

        // creating three employee objects with given details
        Employee e1 = new Employee("Ram", 1994, 50000, "64C Vasant Kunj 110070");
        Employee e2 = new Employee("Sam", 2000, 60000, "68D Dwarka 110037");
        Employee e3 = new Employee("Ana", 1999, 55000, "26B R.K Puram 110022");

        // print table header
        System.out.printf("%-10s %-20s %-30s\n", "Name", "Year of joining", "Address");

        // print employee records
        e1.display();
        e2.display();
        e3.display();
    }
}
