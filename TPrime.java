import java.util.Scanner;

public class TPrime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int LIMIT = 1000000;

        boolean[] prime = new boolean[LIMIT + 1];

        for (int i = 2; i <= LIMIT; i++) {
            prime[i] = true;
        }

        // Sieve of Eratosthenes
        for (int i = 2; i * i <= LIMIT; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= LIMIT; j += i) {
                    prime[j] = false;
                }
            }
        }

        while (n-- > 0) {
            long x = sc.nextLong();

            long root = (long) Math.sqrt(x);

            if (root * root == x && prime[(int) root]) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}