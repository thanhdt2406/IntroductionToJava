import java.util.Scanner;

public class ConvertMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter money (USD): ");
        double inputMoney = scanner.nextDouble();

        System.out.println("Enter the rate: ");
        double rate = scanner.nextDouble();

        System.out.println("VND: "+inputMoney*rate);
    }
}
