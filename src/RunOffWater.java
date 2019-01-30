import java.util.Scanner;

public class RunOffWater {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the width of your roof?");
        int roofWidth = scanner.nextInt();

        System.out.println("What is the length of your roof?");
        int roofLength = scanner.nextInt();

        System.out.println("What is the amount of the rainfall in inches?");
        int rainfallAmount = scanner.nextInt();

        int widthInFt = roofWidth * 12;
        int lengthInFt = roofLength * 12;

        int total = widthInFt * lengthInFt * rainfallAmount;

        int finalResult = total/231;

        System.out.println(finalResult);



    }
}
