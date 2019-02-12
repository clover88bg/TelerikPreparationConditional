import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);
        int n = scann.nextInt();
        while (n % 2 == 0) {
            System.out.println(2);
            n /= 2;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                System.out.println(i);
                n /= i;
            }
        }
        if (n > 2)
            System.out.print(n);
    }
}
