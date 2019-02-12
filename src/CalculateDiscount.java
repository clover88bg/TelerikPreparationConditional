
import java.util.Formatter;
        import java.util.Scanner;
public class CalculateDiscount {
    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);
        int number = scann.nextInt();
        StringBuilder sbuf = new StringBuilder();
        Formatter fmt = new Formatter(sbuf);
        for (int i = 0;i < number; i++){
            fmt.format("%.2f%n",((scann.nextDouble())*35.0)/100);
        }
        System.out.println(sbuf.toString());
    }
}
