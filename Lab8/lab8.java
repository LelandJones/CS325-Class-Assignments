import java.util.Scanner;
public class lab8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("CS325 AI Bot Guessing Game ...");

        System.out.print("Enter the largest number: ");

        int MAX = input.nextInt();

        int low = 1;

        int high = MAX;

        boolean found = false;

        int guessCount = 0;

        System.out.println("Pick a number between 1 and " + MAX + " but dont tell me");

        System.out.println("I can guess your number in " + (int)(Math.log(MAX) / Math.log(2) + 1) + " guesses");

        while (!found) {
            int guess = (low + high) / 2;
            guessCount++;
            System.out.println("Guess +" + guessCount + ": Is your number " + guess + "? (y,n)");
            String answer = input.next();
            if (answer.equals("y")) {
                found = true;
                System.out.println("I was able to guess your number in " + guessCount + " guesses");
            } 
            else if (answer.equals("n")) {
                System.out.println("Is your number higher or lower than " + guess + "? (h,l)");
                String hint = input.next();
                if (hint.equals("h")) {
                    low = guess + 1;
                } 
                else if (hint.equals("l")) {
                    high = guess - 1;
                } 
                else {
                    System.out.println("Invalid input. Please respond with 'h' or 'l'.");
                    break;
                }
            } 
            else {
                System.out.println("Invalid input. Please respond with 'y' or 'n'.");
            }

        }
        input.close();  
    }
}     
