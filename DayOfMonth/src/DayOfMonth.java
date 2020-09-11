import java.util.Scanner;

public class DayOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which month that you want to count days?");
        int month = scanner.nextInt();

        String day;
        switch (month) {
            case 2 -> day = "28 or 29";
            case 4, 6, 9, 11 -> day = "30";
            default -> day = "31";
        }

        if (!day.equals("")) {
            System.out.println("The month '" + month + "' has " + day + " days!");
        } else {
            System.out.println("Invalid input!");
        }
    }
}
