import java.util.Scanner;

public class MatrixNumbers {
    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);
        int num = scann.nextInt();
        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <= num; j++) {

                System.out.print(j +(i-1) + " ");
            }
            System.out.println();
        }
    }
}
