import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numOne,numTwo,numThree,smallNum;
        numOne = scnr.nextInt();
        numTwo = scnr.nextInt();
        numThree =scnr.nextInt();
        if(numOne > numTwo)
            smallNum = numTwo;
        else
            smallNum = numOne;
        if(smallNum > numThree)
            System.out.println(numThree);
        else
            System.out.println(smallNum);
    }
}
