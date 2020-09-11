import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = scanner.nextInt();

        boolean isLeapYear = false;

        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    isLeapYear = true;
                }
            } else{
                isLeapYear = true;
            }
        }

        if(isLeapYear){
            System.out.println("The year '"+year+"' is a leap year!");
        } else{
            System.out.println("The year '"+year+"' isn't a leap year!");
        }
    }
}
