import java.util.Scanner;

public class PrintDeckOfCards {
    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);
        String str = scann.nextLine();
        boolean abc = true;
        int num = 0;
        if (str == null) {
            abc = false;
        }
        int length = str.length();
        if (length == 0) {
            abc = false;
        }
        int i = 0;
        if (str.charAt(0) == '-') {
            if (length == 1) {
                abc = false;
            }
            i = 1;
        }
        for (; i < length; i++) {
            char c = str.charAt(i);
            if (c <= '/' || c >= ':') {
                abc = false;
            }
        }
        if (abc) {
            num = Integer.parseInt(str);
            for (int ii = 2; ii <= num; ii++) {
                System.out.println(ii + " of spades, " + ii + " of clubs, " + ii + " of hearts, " + ii + " of diamonds");
            }
        } else {
            num = 10;
            for (int ii = 2; ii <= num; ii++) {
                System.out.println(ii + " of spades, " + ii + " of clubs, " + ii + " of hearts, " + ii + " of diamonds");
            }
            if (str.equals("J")) {
                System.out.println(("J of spades, J of clubs, J of hearts, J of diamonds"));
            } else if (str.equals("Q")) {
                System.out.println(("J of spades, J of clubs, J of hearts, J of diamonds"));
                System.out.println(("Q of spades, Q of clubs, Q of hearts, Q of diamonds"));
            } else if (str.equals("K")) {
                System.out.println(("J of spades, J of clubs, J of hearts, J of diamonds"));
                System.out.println(("Q of spades, Q of clubs, Q of hearts, Q of diamonds"));
                System.out.println(("K of spades, K of clubs, K of hearts, K of diamonds"));
            } else {
                System.out.println(("J of spades, J of clubs, J of hearts, J of diamonds"));
                System.out.println(("Q of spades, Q of clubs, Q of hearts, Q of diamonds"));
                System.out.println(("K of spades, K of clubs, K of hearts, K of diamonds"));
                System.out.println(("A of spades, A of clubs, A of hearts, A of diamonds"));
            }
        }

    }
}




