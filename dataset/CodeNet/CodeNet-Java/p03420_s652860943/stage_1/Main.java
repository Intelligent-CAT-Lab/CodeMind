import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();
        long ans = 0;
        for(int alpha = 1; K+alpha<=N;++alpha){
            int b = K+alpha;
            int n = (N-K)/b;
            ans += n*alpha;
var newVariable_0 = Math.min(N, K+n*b+alpha-1);            if(K+n*b<=N)ans += newVariable_0 - (K+n*b)+1;
        }
        if(K==0)ans -=N;
        System.out.println(ans);
    }   
}