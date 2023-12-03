import java.util.ArrayList;
import java.util.List;

public class Management {
    static double workingDaysPerMonth = 20.0;

    List<Employee> employees = new ArrayList<>();

    // constructor for Motorcycle
    Motorcycle m1 = new Motorcycle("Duckti", "Custom Plate", "Yellow", VehicleType.RACE, false);
    Motorcycle m2 = new Motorcycle("Yahama", "Custom Plate", "Black", VehicleType.NOT_FOR_RACE, true);

    // constructor for Car
    Car vt1 = new Car("Rolls Royce", "Custom Plate", "White", VehicleType.Family, Gear.Manual, CarType.Sport);
    Car vt2 = new Car("Kia", "Custom Plate", "Green", VehicleType.Family, Gear.Automatic, CarType.Sedan);
    Car vt3 = new Car("Ford", "Custom Plate", "Blue", VehicleType.Family, Gear.Manual, CarType.Hatchback);
    Car vt4 = new Car("Ram", "Custom Plate", "Red", VehicleType.Family, Gear.Automatic, CarType.SUV);

    void hireTest1() {
        employees.add(new Manager("Karam", 1985, 30, 4));
        employees.add(new Manager("Aatman", 1974, 20, 6));
        employees.add(new Programmer("Hyder", 1993, 3, 75));
        employees.add(new Tester("Roseta", 1987, 124, 50));
        employees.add(new Programmer("Shubu", 1981, 5, 110));
        employees.add(new Programmer("Kavya", 1986, 3));
        for (Employee employee : employees) {
            System.out.println("We have a new employee: " + employee.getName() + ", a " + employee.getClass().getSimpleName().toLowerCase() + ".");
        }
    }

    void hireTest2() {
        employees.clear();
        employees.add(new Manager("Karam", 1985, 30, 4, vt1));
        employees.add(new Manager("Aatman", 1974, 20, 6, 80, vt2));
        employees.add(new Programmer("Hyder", 1993, 3, 75, m1));//1
        employees.add(new Tester("Roseta", 1987, 124, 50, m2));
        employees.add(new Programmer("Shubu", 1981, 5, 110, vt4));
        employees.add(new Programmer("Kavya", 1986, 3, vt3));
        for (Employee employee : employees) {
            System.out.println("We have a new employee: " + employee.getName() + ", a " + employee.getClass().getSimpleName().toLowerCase() + ".");
        }

        for (Employee employee : employees) {
            System.out.println("-------------------------");
            System.out.println(employee);
            System.out.println("-------------------------");
        }
    }

    void hireTest3() {
        employees.clear();
        Employee Serge = new Manager("Karam", 1985, 30, 4, vt1);
        Employee Cindy = new Manager("Aatman", 1974, 20, 6, 80, vt2);
        Employee Paul = new Programmer("Hyder", 1993, 3, 75, m1);
        Employee Pierre = new Tester("Roseta", 1987, 124, 50, m2);
        Employee Matt = new Programmer("Shubu", 1981, 5, 110, vt4);
        Employee Sarah = new Programmer("Kavya", 1986, 3, vt3);

        Contract p1 = new Permanent(2, true, 6000, 200, 17);
        Contract p2 = new Permanent(3, false, 5000, 150, 19);
        Contract t1 = new Temporary(60, 30);
        Contract t2 = new Temporary(50, 60);
        Contract p3 = new Permanent(1, true, 4000, 100, 20);
        Contract p4 = new Permanent(4, true, 4500, 100, 19);
        Serge.signContract(p1);
        Cindy.signContract(p2);
        Paul.signContract(t1);
        Matt.signContract(t2);
        Pierre.signContract(p3);
        Sarah.signContract(p4);

        employees.add(Serge);
        employees.add(Cindy);
        employees.add(Paul);
        employees.add(Pierre);
        employees.add(Matt);
        employees.add(Sarah);

        for (Employee employee : employees) {
            System.out.println("-------------------------");
            System.out.println(employee);
            System.out.println("-------------------------");
        }

        System.out.println("-------------------------");
        System.out.println("Contracts: ");
        System.out.println("-------------------------");
        for (Employee employee : employees) {
            System.out.print(employee.contractInfo());
        }
        System.out.println("-------------------------");

        // update Matt's contract
        Contract p5 = new Permanent(1, true, 5000, 200, 30);
        Matt.signContract(p5);

        System.out.println("-------------------------");
        System.out.println("Contracts: ");
        System.out.println("-------------------------");
        for (Employee employee : employees) {
            System.out.print(employee.contractInfo());
        }
        System.out.println("-------------------------");

    }
}
