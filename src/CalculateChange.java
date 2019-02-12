
import java.util.Scanner;

public class CalculateChange {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        double price = scann.nextDouble();
        double amountPaid = scann.nextDouble();
        double change = amountPaid - price;
        change *= 100;
        change = (double)Math.round(change);
        int temp =(int)change;
        int stotinki1 = temp % 10;
        temp = temp / 10;
        int stotinki10 = temp % 10;
        temp = temp / 10;
        int lv = temp;
        if (lv != 0) {
            System.out.println(lv + " x 1 lev");
        }
        switch (stotinki10) {
            case 9:
                System.out.println("1 x 50 stotinki");
                System.out.println("2 x 20 stotinki");
                break;
            case 8:
                System.out.println("1 x 50 stotinki");
                System.out.println("1 x 20 stotinki");
                System.out.println("1 x 10 stotinki");
                break;
            case 7:
                System.out.println("1 x 50 stotinki");
                System.out.println("1 x 20 stotinki");
                break;
            case 6:
                System.out.println("1 x 50 stotinki");
                System.out.println("1 x 10 stotinki");
                break;
            case 5:
                System.out.println("1 x 50 stotinki");
                break;
            case 4:
                System.out.println("2 x 20 stotinki");
                break;
            case 3:
                System.out.println("1 x 20 stotinki");
                System.out.println("1 x 10 stotinki");
                break;
            case 2:
                System.out.println("1 x 20 stotinki");
                break;
            case 1:
                System.out.println("1 x 10 stotinki");
                break;
        }
        switch (stotinki1){
            case 9 :
                System.out.println("1 x 5 stotinki");
                System.out.println("2 x 2 stotinki");
                break;
            case 8:
                System.out.println("1 x 5 stotinki");
                System.out.println("1 x 2 stotinki");
                System.out.println("1 x 1 stotinka");
                break;
            case 7:
                System.out.println("1 x 5 stotinki");
                System.out.println("1 x 2 stotinki");
                break;
            case 6:
                System.out.println("1 x 5 stotinki");
                System.out.println("1 x 1 stotinka");
                break;
            case 5:
                System.out.println("1 x 5 stotinki");
                break;
            case 4:
                System.out.println("2 x 2 stotinki");
                break;
            case 3:
                System.out.println("1 x 2 stotinki");
                System.out.println("1 x 1 stotinka");
                break;
            case 2:
                System.out.println("1 x 2 stotinki");
                break;
            case 1:
                System.out.println("1 x 1 stotinka");
                break;
        }
    }
}