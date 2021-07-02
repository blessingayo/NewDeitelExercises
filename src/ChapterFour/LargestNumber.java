package ChapterFour;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int largestNumber;
        int userInput;


        System.out.println("Enter Any Number");
        largestNumber = scanner.nextInt();
        for (int counter = 0; counter < 9; counter++) {
            System.out.println("Enter Any Number");
            userInput = scanner.nextInt();
            if(userInput > largestNumber){
                largestNumber = userInput;
            }
        }
        System.out.println("Largest Number is "+ largestNumber);
    }
}