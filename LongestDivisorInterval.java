import java.util.*;

public class LongestDivisorInterval {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            long n = sc.nextLong();

            int k = 1;

            while(n % k == 0){
                k++;
            }

            System.out.println(k - 1);
        }

        sc.close();
    }
}
