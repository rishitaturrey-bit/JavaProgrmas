import java.util.Scanner;

class StudentNameComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name1 = sc.nextLine();
        String name2 = sc.nextLine();

        if (name1.equals(name2))
            System.out.println("Case-sensitive match");
        else
            System.out.println("Case-sensitive not match");

        if (name1.equalsIgnoreCase(name2))
            System.out.println("Case-insensitive match");
        else
            System.out.println("Case-insensitive not match");
    }
}
