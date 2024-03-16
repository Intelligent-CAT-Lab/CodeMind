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
        System.out.println(DP(N, six, nine));
    }
    public static int DP(int n, int[] six, int[] nine){
        if(n < 6) return n;
        int tmp = n;
        int count6 = 0;
        int count9 = 0;
        for(int i = 0; i < 7; i++){
            if(six[i] <= n){
                n -= six[i];
                count6 = 1;
                break;
            }
        }
        count6 += DP(n, six, nine);
        n = tmp;
        if(n < 9) return count6;
        for(int i = 0; i < 7; i++){
            if(nine[i] <= n){
                n -= nine[i];
                count9 = 1;
                break;
            }
        }
        count9 += DP(n, six, nine);
        n = tmp;
        return Math.min(count6, count9);
    }
}

/2019-09-25/README.md
# 2019-09-25