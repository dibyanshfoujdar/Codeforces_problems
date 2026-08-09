import java.util.*;

public class WalkingMaster{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            

            if (b > d) {
               System.out.println(-1);
               continue;
            }

            int moves = d - b;
            int x = a + moves;

            if (x < c) {
                System.out.println(-1);
            } else {
               System.out.println(moves + (x - c));
            }
            
        }

        sc.close();
    }
}