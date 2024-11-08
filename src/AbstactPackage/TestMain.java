package AbstactPackage;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter greeting: ");
        String greetInput = scanner.next();

        XYZ xyz = new XYZ();
        xyz.FOD();  // Correct method call to FOD
        System.out.println(greetInput + " " + xyz.DAY());  // Print greeting with DAY() result

        scanner.close();
    }
}
