import java.util.*;

public class VasilijeInCacak {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);

       int t = sc.nextInt();

       while(t-- > 0){
          int n = sc.nextInt();
          int k = sc.nextInt();
          int x = sc.nextInt();

          int min_sum = (k*(k+1))/2 ;
          int max_sum = (k*(2*n-k+1))/2 ;

          if(min_sum <= x && x <= max_sum)
             System.out.println("Yes");
          else
             System.out.println("No");  

       }
    }
}
