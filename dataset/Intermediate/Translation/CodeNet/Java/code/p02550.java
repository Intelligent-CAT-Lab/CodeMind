import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class p02550 {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        int X = sc.nextInt();
        int M = sc.nextInt();
        Set<Integer> used = new HashSet<>();
        ArrayList<Integer> A = new ArrayList<>();
        A.add(X);
        used.add(X);

        long K=0;
        long L=0;
        long ans = 0;
        boolean breakflag = false;

        for(int i = 0 ; i < M-1 && i < N-1 ; i++){
            long prev  = (long)A.get(i);
            int now = (int)((prev*prev) % M);
            if(now == 0){
                for(int j = 0 ; j <= i ; j++){
                    ans += A.get(j);
                }
                breakflag = true;
                break;
            }else if(used.contains(now)){
                L = i+1;
                for(int j = 0 ; j <= i ; j++){
                    if(A.get(j) == now){
                        K = j;
                        break;
                    }
                    ans += A.get(j);
                }

                long sub = 0;
                for(int j = (int)K ; j < L ; j++){
                    sub += A.get(j);
                }

                long m = (N-K) % (L-K);
                long left = 0;
                for(int j=0; j < m ; j++){
                    left += A.get((int)K + j);
                }

                ans += ((N-K)/(L-K))*sub + left;
                breakflag =true;
                break;
            }else{
                used.add(now);
                A.add(now);
            }
        }

        if(!breakflag){
            ans = 0;
            for(int a:A){
                ans += a;
            }
        }

        System.out.println(ans);
    }
}
