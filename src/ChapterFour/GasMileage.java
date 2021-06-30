package ChapterFour;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        int milesDriven = 0;
        int gallonUsed = 0;
        double milesPerGallon;
        int total = 0;
        Scanner inputCollector = new Scanner(System.in);
   
        while(milesDriven != -1 || gallonUsed != -1){
            System.out.println("Enter Your Miles Driven");
            milesDriven  = inputCollector.nextInt();
            if(milesDriven != -1){
                System.out.println("Enter Your Gallon Used");
                gallonUsed = inputCollector.nextInt();
                if(gallonUsed != -1){
                    milesPerGallon = (milesDriven * 1.0) / gallonUsed;
                    System.out.printf("Your Miles Per Gallon %f%n", milesPerGallon);
                }
            }
        }
        System.out.println("Total is " +total);
    }
}
                
        