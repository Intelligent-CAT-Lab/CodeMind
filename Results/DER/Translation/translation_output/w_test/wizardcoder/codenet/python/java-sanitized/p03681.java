import java.util.*;

public class p03681 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int diff = N-M;
        if(Math.abs(diff)>1){
            System.out.println(0);
        }
        else if(diff == 0){
            long result = 1;
            for(int i=N; i>=1; i--){
                result = (result*i)%1000000007;
            }
            for(int i=M; i>=1; i--){
                result = (result*i)%1000000007;
            }
            result = (result*2)%1000000007;
            System.out.println(result);
        }
        else{
            long result = 1;
            for(int i=N; i>=1; i--){
                result = (result*i)%1000000007;
            }
            for(int i=M; i>=1; i--){
                result = (result*i)%1000000007;
            }
            System.out.println(result);
        }
    }
}