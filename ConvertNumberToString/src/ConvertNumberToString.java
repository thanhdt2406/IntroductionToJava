import java.util.Scanner;

public class ConvertNumberToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number");
        int number = scanner.nextInt();

        String rs = "";
        if (number > 999 || number < 0) {
            System.out.println("Invalid Input!");
        } else {
            int hundreds = number / 100;
            int tens = (number % 100) / 10;
            int ones = number % 10;
            switch (hundreds) {
                case 1 -> rs += "One";
                case 2 -> rs += "Two";
                case 3 -> rs += "Three";
                case 4 -> rs += "Four";
                case 5 -> rs += "Five";
                case 6 -> rs += "Six";
                case 7 -> rs += "Seven";
                case 8 -> rs += "Eight";
                case 9 -> rs += "Nine";
            }
            if (hundreds != 0) {
                rs += " hundred ";
            }
            if ((tens != 0 || ones != 0)&&(hundreds!=0)) {
                rs += "and ";
            }
            if (tens == 1) {
                switch (ones) {
                    case 1 -> rs += "eleven ";
                    case 2 -> rs += "twelve ";
                    case 3 -> rs += "thirteen ";
                    case 4 -> rs += "fourteen ";
                    case 5 -> rs += "fifteen ";
                    case 6 -> rs += "sixteen ";
                    case 7 -> rs += "seventeen ";
                    case 8 -> rs += "eighteen ";
                    case 9 -> rs += "nineteen ";
                }
            } else if (tens != 0) {
                switch (tens) {
                    case 2 -> rs += "twenty ";
                    case 3 -> rs += "thirty ";
                    case 4 -> rs += "forty ";
                    case 5 -> rs += "fifty ";
                    case 6 -> rs += "sixty ";
                    case 7 -> rs += "seventy ";
                    case 8 -> rs += "eighty ";
                    case 9 -> rs += "ninety ";
                }
            }
            if (ones != 0 && tens != 0) {
                rs += " - ";
            }
            switch (ones) {
                case 1 -> rs += "one ";
                case 2 -> rs += "two ";
                case 3 -> rs += "three ";
                case 4 -> rs += "four ";
                case 5 -> rs += "five ";
                case 6 -> rs += "six ";
                case 7 -> rs += "seven ";
                case 8 -> rs += "eight ";
                case 9 -> rs += "nine ";
            }

            System.out.println(rs);
        }
    }
}
