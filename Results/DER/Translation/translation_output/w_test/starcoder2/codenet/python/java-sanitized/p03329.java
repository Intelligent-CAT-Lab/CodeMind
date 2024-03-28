import java.util.*;
public class p03329 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] six = new int[7];
        int[] nine = new int[7];
        for(int i = 1; i < 8; i++){
            six[i-1] = (int)Math.pow(6, i);
            nine[i-1] = (int)Math.pow(9, i);
        }
        int count6 = 0;
        int count9 = 0;
        int tmp = N;
        for(int i = 6; i >= 0; i--){
            if(six[i] <= N){
                N -= six[i];
                count6 = 1;
                break;
            }
        }
        count6 += DP(N);
        N = tmp;
        if(N < 9){
            System.out.println(count6);
            return;
        }
        for(int i = 6; i >= 0; i--){
            if(nine[i] <= N){
                N -= nine[i];
                count9 = 1;
                break;
            }
        }
        count9 += DP(N);
        N = tmp;
        System.out.println(Math.min(count6, count9));
    }
    public static int DP(int n){
        if(n < 6){
            return n;
        }
        int tmp = n;
        int count6 = 0;
        int count9 = 0;
        for(int i = 6; i >= 0; i--){
            if(six[i] <= n){
                n -= six[i];
                count6 = 1;
                break;
            }
        }
        count6 += DP(n);
        n = tmp;
        if(n < 9){
            return count6;
        }
        for(int i = 6; i >= 0; i--){
            if(nine[i] <= n){
                n -= nine[i];
                count9 = 1;
                break;
            }
        }
        count9 += DP(n);
        n = tmp;
        return Math.min(count6, count9);
    }
}