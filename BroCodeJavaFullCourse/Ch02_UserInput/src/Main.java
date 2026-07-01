import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Ch02 - User Input \n\n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("You have entered: " + name);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("You have entered: " + age);

        scanner.close();
    }
}
