import java.util.Scanner;

public class FindAverage {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int number = scann.nextInt();
        double num = 0;
        for (int i = 0; i< number ; i ++){
            num = num + scann.nextDouble();
        }
        num /= number ;
        System.out.printf("%.2f",num);
    }
}