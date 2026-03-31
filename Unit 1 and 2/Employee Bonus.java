abstract class Employee {
    String name;
    int id;

    Employee(String n, int i) {
        name = n;
        id = i;
    }

    abstract double calculateBonus();
}

class Manager extends Employee {
    double salary;

    Manager(String n, int i, double s) {
        super(n, i);
        salary = s;
    }

    double calculateBonus() {
        return salary * 0.20;
    }
}

class Developer extends Employee {
    double salary, incentive;

    Developer(String n, int i, double s, double inc) {
        super(n, i);
        salary = s;
        incentive = inc;
    }

    double calculateBonus() {
        return salary * 0.10 + incentive;
    }
}

class TestEmp {
    public static void main(String[] args) {
        Employee e;

        e = new Manager("Riya", 1, 50000);
        System.out.println("Bonus: " + e.calculateBonus());

        e = new Developer("Aman", 2, 40000, 5000);
        System.out.println("Bonus: " + e.calculateBonus());
    }
}