import java.util.Scanner;

public class OddAndEvenProduct {
    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);
        int number = scann.nextInt();
        int[] arr = new int[number];
        for (int i = 0; i < number; i++) {
            arr[i] = scann.nextInt();
        }
        int sum = 1;
        int sum1 = 1;
        for (int i = 0; i < number; i++){
            if(i%2 == 0){
                sum *= arr[i];
            }else {
                sum1 *= arr[i];
            }
        }

            if (sum == sum1) {
                System.out.println("yes " + sum);
            } else {
                System.out.println("no " + sum + " " + sum1);
            }
        }
    }



