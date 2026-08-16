import java.util.*;

public class Forked {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();

       while(t-- > 0){
           int a = sc.nextInt();
           int b = sc.nextInt();
           int x_king = sc.nextInt();
           int y_king = sc.nextInt();
           int x_queen = sc.nextInt();
           int y_queen = sc.nextInt();
           
           Set<String> king_hits = new HashSet<>();
           Set<String> queen_hits = new HashSet<>();
         
           int[][] moves = {
                {a, b}, {a, -b},
                {-a, b}, {-a, -b},
                {b, a}, {b, -a},
                {-b, a}, {-b, -a}
            };

            for (int[] move : moves) {
                int x = x_king + move[0];
                int y = y_king + move[1];
                king_hits.add(x + "," + y);
            }

            for (int[] move : moves) {
                int x = x_queen + move[0];
                int y = y_queen + move[1];
                queen_hits.add(x + "," + y);
            }

            int answer = 0;

            for(String pos : king_hits){
                if(queen_hits.contains(pos))
                    answer++;
            }

            System.out.println(answer);

        }

        sc.close();
    }
}
