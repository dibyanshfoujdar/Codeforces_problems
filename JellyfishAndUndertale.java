import java.util.*;

public class JellyfishAndUndertale {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            long totalTime = b;

            for(int i = 0 ; i < n ; i++){
               int x = sc.nextInt();
               totalTime += Math.min(a-1, x);
            }

            System.out.println(totalTime);
        }

        sc.close();
    }
    
}
