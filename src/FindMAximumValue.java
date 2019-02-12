import java.util.Scanner;

public class FindMAximumValue {
    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);
        int num = scann.nextInt();
        int number = -201;
        int [] arr = new int [num];
        for (int i = 0; i< num; i++){
            arr[i] = scann.nextInt();
        }
        for (int i : arr){
            if( i > number){
                number = i ;
            }
        }
        System.out.println(number);
    }
}
