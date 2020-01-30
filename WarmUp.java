import java.util.Scanner;

public class WarmUp {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userInt;
        double userDouble;
        char userChar;
        String userString;

        System.out.println("Enter integer:");
        userInt = scnr.nextInt();
        System.out.println("Enter a Double:");
        userDouble = scnr.nextDouble();
        System.out.println("Enter a Character:");
        userChar = scnr.next().charAt(0);
        System.out.println("Enter a String:");
        scnr.nextLine();
        userString = scnr.nextLine();
        System.out.println(userInt + " " + userDouble + " " + userChar + " " + userString);
        System.out.println(userString + " " + userChar + " " + userDouble + " " + userInt);
        System.out.println(userDouble + " cast to an integer is " + (int)userDouble);
    }
}
