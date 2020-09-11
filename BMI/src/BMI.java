import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weight, height;
        System.out.println("Enter weight (kg): ");
        weight = scanner.nextDouble();
        System.out.println("Enter height (m): ");
        height = scanner.nextDouble();

        double bmi = weight / Math.pow(height, 2);
        String rs;

        if (bmi < 18.5) {
            rs = "Underweight";
        } else if (bmi < 25) {
            rs = "Normal";
        } else if (bmi < 30) {
            rs = "Overweight";
        } else rs = "Obese";

        System.out.println(bmi + " - " + rs);
    }
}
