import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
System.out.println("[INST]5;N;scan.nextInt();"+N);
        int K = scan.nextInt();
System.out.println("[INST]6;K;scan.nextInt();"+K);
        long ans = 0;
        for(int alpha = 1; K+alpha<=N;++alpha){
            int b = K+alpha;
            int n = (N-K)/b;
            ans += n*alpha;
            if(K+n*b<=N)ans += Math.min(N, K+n*b+alpha-1) - (K+n*b)+1;
System.out.println("[INST]12;None;Math.min(N, K+n*b+alpha-1);"+Math.min(N, K+n*b+alpha-1));
        }
        if(K==0)ans -=N;
        System.out.println(ans);
    }   
}