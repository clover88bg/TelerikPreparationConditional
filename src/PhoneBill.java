import java.util.Scanner;

public class PhoneBill {
        public static void main(String[] args) {
            Scanner scann = new Scanner(System.in);
            int txt = scann.nextInt();
            int min = scann.nextInt();
            txt -= 20;
            double txtPrice = 0.06;
            txtPrice *= txt;
            if (txt > 0){
            System.out.printf("%d additional messages for %.2f levas\n",txt,txtPrice);
            }else {
                System.out.println("0 additional messages for 0.00 levas");
            }
            min -= 60;
            double minPrice = 0.1;
            minPrice *= min;
            if (min > 0){
                System.out.printf("%d additional minutes for %.2f levas\n",min,minPrice);
            }else {
                System.out.println("0 additional minutes for 0.00 levas");
            }
            if (txtPrice < 0) {
                txtPrice = 0;
            }
            if (minPrice < 0){
                minPrice = 0;
            }
                System.out.printf("%.2f additional taxes\n", ((txtPrice + minPrice) * 20 / 100));
                System.out.printf("%.2f total bill", (12 + txtPrice + minPrice + ((txtPrice + minPrice) * 20 / 100)));


        }
    }
