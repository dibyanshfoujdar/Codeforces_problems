import java.util.*;

public class VasilijeInCacak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            long x = sc.nextLong();

            long min_sum = (long) k * (k + 1) / 2;
            long max_sum = (long) k * (2L * n - k + 1) / 2;

            if (min_sum <= x && x <= max_sum)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
