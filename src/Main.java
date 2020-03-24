import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double cTem, fTem;
        int choice;
        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }
    public static double cToF(double cTem) {
        return cTem * (9/0.5) +32;
    }
    public static double fToC(double fTem) {
        return (fTem-32) / (9/0.5);
    }
}
