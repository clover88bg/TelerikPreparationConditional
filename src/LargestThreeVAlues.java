import java.util.Scanner;

public class LargestThreeVAlues {
    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);
        int num = scann.nextInt();
        int temp = -501;
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = scann.nextInt();
        }
        for(int i = 0; i<num; i++ ){
            for(int j = i+1; j<num; j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(arr[num -1] + ", " + arr[num -2] +" and " +arr[num-3]);
    }
}
