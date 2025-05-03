import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, GitHub!");
        System.out.println("Have a great day!");
        System.out.println("Goodbye for now!");

        Scanner scanner = new Scanner(System.in);
        System.out.print("What's your name? ");
        String name = scanner.nextLine();
        System.out.println("Nice to meet you, " + name + "!");
    }
}
