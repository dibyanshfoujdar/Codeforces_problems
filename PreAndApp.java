import java.util.*;

public class PreAndApp{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            String binaryString = sc.next();
            int left = 0;
            int right = n-1;     

            while(left < right && binaryString.charAt(left) != binaryString.charAt(right)){
                left++;
                right--;
            }

            System.out.println(right - left + 1);
        }
        
        sc.close();
    }

   
}