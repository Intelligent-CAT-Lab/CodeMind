import java.util.Arrays;
import java.util.Scanner;

class Main{

    static long M;
    static long[][] S;
    static long[][] C;
    static int N;

    static long[][] complex(int N){
        long[][] res = new long[N+1][N+1];
        for(int i=0;i<=N;++i){
            res[i][0]=res[i][i]=1;
            for(int j=1;j<i;++j){
                res[i][j]=(res[i-1][j]+res[i-1][j-1])%M;
            }
        }
        return res;
    }

    static long[][] stirling(int N){
        long[][] res = new long[N+1][N+1];
        //i個を空でないjに分割(含まれないものが合っても良い)
        for(int i=0;i<=N;++i){
            res[i][0]=res[i][i]=1;
            for(int j=1;j<i;++j){
                res[i][j] = (res[i-1][j-1] + (long)(j+1)*(res[i-1][j]%M))%M;
            }
        }
        return res;
    }

    //a^x
    static long beki(long a, long x, long mod){
        long res=1;
        for(int i=0;i<32;++i){
            if(((x>>i)&1)==1)res=(res*a)%mod;
            a = (a*a)%mod;
        }
        return res;
    }

    static long ways(int i){
        long res = 0;
        long b1 = beki(2,N-i,M);
        long beki1 = 1;
        long beki2 = beki(2,beki(2,N-i,M-1)%(M-1),M);
        for(int j=0;j<=i;++j){
            res = (res+ways2(i,j,beki1,beki2))%M;
            beki1 = (beki1*b1)%M;
        }
        return res;
    }

    static long ways2(int i,int j,long beki1, long beki2){
        return ((S[i][j]*beki1)%M*beki2%M)%M;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        M = scan.nextLong();
        C = complex(N);
        S = stirling(N);
        long ans = 0;
        for(int i=0;i<=N;++i){
            ans = (ans + (i%2==0 ? 1:-1)*(C[N][i]*ways(i))%M + (i%2==0 ? 0:M))%M;
        }
        System.out.println(ans);
    }
}