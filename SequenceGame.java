import java.util.*;

public class SequenceGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            ArrayList<Integer> ans = new ArrayList<>();

            int prev = sc.nextInt();
            ans.add(prev);

            for (int i = 1; i < n; i++) {
                int curr = sc.nextInt();

                if (curr < prev) {
                    ans.add(1);
                }

                ans.add(curr);
                prev = curr;
            }

            System.out.println(ans.size());

            for (int x : ans) {
                System.out.print(x + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
