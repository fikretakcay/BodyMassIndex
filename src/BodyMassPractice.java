import java.util.Scanner;

public class BodyMassPractice {
    public static void main(String[] args) {
        double size,bodyMassIndex;
        int weight;

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your size :");
        size = scan.nextDouble();
        System.out.println("Please enter your weight :");
        weight = scan.nextInt();

        bodyMassIndex = (weight) / ((size) * (size));
        System.out.println("Your Body Mass Index :" + bodyMassIndex);
    }
}
