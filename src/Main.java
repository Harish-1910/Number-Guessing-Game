import java.util.Random;
import java.util.Scanner;

class NumberGuessNumber {
    public static void main(String[] args) {
        try {


            System.out.println("\uD83C\uDFB0\uD83C\uDFB0\uD83C\uDFB0\uD83C\uDFB0  WELCOME TO NUMBER GUESS GAME  \uD83C\uDFB0\uD83C\uDFB0\uD83C\uDFB0\uD83C\uDFB0");

            Scanner sh = new Scanner(System.in);
            Random ran = new Random();
            int value = ran.nextInt(100);
            int count = 0;
            for (int i = 0; i < 20; i++) {
                String choice = "yes";
                while (choice.equals("yes")) {
                    System.out.println("ENTER THE NUMBER BETWEEN 1 TO 100");
                    int number = Integer.parseInt(sh.nextLine());
                    if (number > 101) {
                        System.out.println("Wrong Input !!!");
                        break;
                    }
                    if (value > number) {
                        System.out.println(" Guess!!!Little Higher");
                        break;
                    }
                    if (value < number) {
                        System.out.println("Guess!!!Little Lower");
                        break;
                    }
                    if (value == number) {
                        count++;
                        System.out.println(" !!!!CORRECT!!!!");
                        System.out.println("Your Score "+count);
                        System.out.println("Are You Want Play Again ( Yes or No )");
                        choice = sh.nextLine().toLowerCase();
                        if (choice.equals("no")) {
                            i = 20;
                            System.out.println("Your present score"  +  count);
                            break;
                        }
                        while (!choice.equals("yes")) {
                            System.out.println("Enter The Correct Input yes or no");
                            choice = sh.nextLine().toLowerCase();

                        }
                        value = ran.nextInt(100);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Something Went Wrong");
            System.out.println("Numbers only Allowed");
        }
    }
}