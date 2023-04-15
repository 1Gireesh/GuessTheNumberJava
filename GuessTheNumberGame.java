import java.util.Scanner;

class GuessTheNumberGame {

    static Scanner sc = new Scanner(System.in);
    static int num = (int) (Math.random() * 100);

    public static void main(String args[]) {
        System.out.println("wellcome to guess the number game please enter an number");
        inputAndCheck();
    }

    public static void inputAndCheck() {
        try {
            String userInput = sc.next();
            int userInputToNumber = 400;
            try {
                userInputToNumber = Integer.parseInt(userInput);
            } catch (Exception e) {
                System.out.println("error in inputCheck while  " + e.getMessage());
            }

            if (userInputToNumber == 400) {
                System.out.println("please enter number only");
                inputAndCheck();
                return;
            }
            if (validater(userInputToNumber) == 1)
                System.out.println("you guessed number correctly you win the game");

            else if (validater(userInputToNumber) == 2) {
                System.out.println("the number is greater than " + userInput);
                inputAndCheck();
            } else if (validater(userInputToNumber) == 3) {
                System.out.println("the number is smaller than " + userInput);
                inputAndCheck();
            }
        } catch (Exception e) {
            System.out.println("error in inputCheck " + e.getMessage());
        }
    }

    public static int validater(int input) {
        if (input == num)
            return 1;
        if (input < num)
            return 2;
        return 3;
    }

}