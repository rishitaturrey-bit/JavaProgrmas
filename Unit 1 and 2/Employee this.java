class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println(name + " " + salary);
    }

    public static void main(String[] args) {
        Employee e = new Employee("Riya", 50000);
        e.display();
    }
}
