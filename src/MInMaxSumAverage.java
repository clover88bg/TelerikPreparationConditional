import java.util.Scanner;

public class MInMaxSumAverage {
    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);
        int number = scann.nextInt();
        double max;
        double num = 0;
        double temp = 0;
        double temp1 = Double.MAX_VALUE;
        for (int i = 0; i < number; i++) {
            max = scann.nextDouble();
            if (max < temp1)
                temp1 = max;

            if (max > temp)
                temp = max;
            num = num + max;
        }
        System.out.printf("min=%.2f\n", temp1);
        System.out.printf("max=%.2f\n", temp);
        System.out.printf("sum=%.2f\n", num);
        num /= number;
        System.out.printf("avg=%.2f", num);
    }
}