import java.util.Scanner;

public class UnitArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int positive = 0;
            int negative = 0;

            for (int i = 0; i < n; i++) {
                if (sc.nextInt() == -1)
                    negative++;
                else
                    positive++;
            }

            int operations = 0;

            while (negative > positive) {
                negative--;
                positive++;
                operations++;
            }

            if (negative % 2 == 1)
                operations++;

            System.out.println(operations);
        }

        sc.close();
    }
}