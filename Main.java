import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // accepting input from the user
        int units = sc.nextInt();

        // calculating electricity bill based on given units
        System.out.println("$ " + ElectricityBill.calculateBill(units));

        // closing resource
        sc.close();
    }
}