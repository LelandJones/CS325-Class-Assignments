package Lab2;

public class lab2 {

    public static void main(String[] args) {
        int num;

        if (args.length > 0) {
            try {
                num = Integer.parseInt(args[0]);
                if (num < 2) {
                    System.out.println("Input must be 2 or greater. Using default 1000.");
                    num = 1000;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Using default 1000.");
                num = 1000;
            }
        } else {
            num = 1000;
        }

        System.out.println("N = " + num);
        showPrimes(num);
    }

    public static void showPrimes(int N) {
        System.out.println("Inside showPrimes, got N = " + N);
    }
}

