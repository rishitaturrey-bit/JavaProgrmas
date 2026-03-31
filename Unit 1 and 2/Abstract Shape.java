abstract class Shape {
    abstract void calculate_area();

    void display_info() {
        System.out.println("Shape Info");
    }
}

class Circle extends Shape {
    void calculate_area() {
        System.out.println("Circle Area: " + (3.14 * 5 * 5));
    }
}

class RectangleShape extends Shape {
    void calculate_area() {
        System.out.println("Rectangle Area: " + (4 * 6));
    }

    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new RectangleShape();

        s1.display_info();
        s1.calculate_area();

        s2.display_info();
        s2.calculate_area();
    }
}