import java.util.Scanner;

public class ConvertDegrees {
    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);
        String str = scann.nextLine();
        String[] tokens = str.split(" ");
        double[] arr = new double[tokens.length];
        int i=0;
        for (String st : tokens) {
            arr[i++] = Double.valueOf(st);
        }
        for (double d : arr) {
            System.out.printf("%.0f\n", (d * 1.8) +32);
        }
    }
}