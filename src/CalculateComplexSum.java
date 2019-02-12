import java.util.Scanner;


public class CalculateComplexSum {


    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);
        {
            double x = scann.nextDouble();
            double n = scann.nextDouble();
            double i, total = 1.0;
            for (i = 1; i <= n; i++) {
                total = total + (Math.pow(x, i) / i);
            }
            System.out.printf("%.5f", total);
        }
    }
}