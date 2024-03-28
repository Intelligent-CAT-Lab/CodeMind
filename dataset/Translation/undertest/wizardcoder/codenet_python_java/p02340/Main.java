import java.util.*;

public class p02340 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int MOD = 1000000007;

        int[][] D = new int[N+1][K+1];
        for(int i=0;i<=N;i++){
            D[i][1] = 1;
        }
        for(int i=1;i<=K;i++){
            D[0][i] = 1;
        }
        for(int i=1;i<=N;i++){
            for(int j=1;j<=K;j++){
                if(i>=j){
                    D[i][j] = (D[i-j][j] + D[i][j-1]) % MOD;
                }else{
                    D[i][j] = D[i][i];
                }
            }
        }
        System.out.println(D[N][K]);
    }
}