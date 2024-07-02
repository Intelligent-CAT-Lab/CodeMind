import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
System.out.println("[INST]8;N;sc.nextLong();"+N);
        int X = sc.nextInt();
System.out.println("[INST]9;X;sc.nextInt();"+X);
        int M = sc.nextInt();
System.out.println("[INST]10;M;sc.nextInt();"+M);
        Set<Integer> used = new HashSet<>();
        ArrayList<Integer> A = new ArrayList<>();
        A.add(X);
System.out.println("[INST]13;None;A.add(X);"+A.add(X));
        used.add(X);
System.out.println("[INST]14;None;used.add(X);"+used.add(X));

        long K=0;
        long L=0;
        long ans = 0;
        boolean breakflag = false;

        for(int i = 0 ; i < M-1 && i < N-1 ; i++){
            long prev  = (long)A.get(i);
System.out.println("[INST]22;None;A.get(i);"+A.get(i));
            int now = (int)((prev*prev) % M);
            if(now == 0){
                for(int j = 0 ; j <= i ; j++){
                    ans += A.get(j);
System.out.println("[INST]26;ans;A.get(j);"+ans);
                }
                breakflag = true;
                break;
            }else if(used.contains(now)){
System.out.println("[INST]30;None;used.contains(now);"+used.contains(now));
                L = i+1;
                for(int j = 0 ; j <= i ; j++){
                    if(A.get(j) == now){
System.out.println("[INST]33;None;A.get(j);"+A.get(j));
                        K = j;
                        break;
                    }
                    ans += A.get(j);
System.out.println("[INST]37;ans;A.get(j);"+ans);
                }

                long sub = 0;
                for(int j = (int)K ; j < L ; j++){
                    sub += A.get(j);
System.out.println("[INST]42;sub;A.get(j);"+sub);
                }

                long m = (N-K) % (L-K);
                long left = 0;
                for(int j=0; j < m ; j++){
                    left += A.get((int)K + j);
System.out.println("[INST]48;left;A.get((int)K + j);"+left);
                }

                ans += ((N-K)/(L-K))*sub + left;
                breakflag =true;
                break;
            }else{
                used.add(now);
System.out.println("[INST]55;None;used.add(now);"+used.add(now));
                A.add(now);
System.out.println("[INST]56;None;A.add(now);"+A.add(now));
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
