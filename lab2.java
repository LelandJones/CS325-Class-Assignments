

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
            System.out.println("Missing argument, using default 1000.");
            num = 1000;
        }

        System.out.println("N = " + num);
        showPrimes(num);
    }

    public static void showPrimes(int N) {
        boolean[] isPrime = new boolean[N + 1];

        if (N >= 0) isPrime[0] = false;
        if (N >= 1) isPrime[1] = false;
        for (int i = 2; i <= N; i++) {
            isPrime[i] = true;
        }

        int limit = (int) Math.sqrt(N);
        for (int i = 2; i <= limit; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= N; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        System.out.print("Primes: ");
        for (int i = 2; i <= N; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
