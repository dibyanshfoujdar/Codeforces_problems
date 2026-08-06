import java.util.*;

public class BlankSpace{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int maxCount = 0;
            int count = 0 ;
            int n = sc.nextInt();

            for(int i = 0 ; i < n ; i++){
                int a = sc.nextInt();

                if(a == 0){
                    count++;
                }else{
                    count = 0 ;
                }

                maxCount = Math.max(count , maxCount);
            }

            System.out.println(maxCount);
        }
        sc.close();

    }
}