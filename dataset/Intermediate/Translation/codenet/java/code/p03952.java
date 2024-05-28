import java.util.*;
import java.io.*;

/*
   AtCoder contest code
   coder : yoichidon
 */

public class p03952 {
    public static int[] solve(int N, int x){
        int[] ans = new int[2*N-1];
        if(N==2){
            return new int[]{1,2,3};
        }

        if(x==2){
            ans[N-2] = 2*N-1;
            ans[N-1] = 2;
            ans[N]   = 1;
            ans[N+1] = 2*N-2;
            int elm = 3;
            for(int index=0; index<2*N-1; index++){
                if(ans[index]==0){
                    ans[index]=elm;
                    elm++;
                }
            }
        }else{
            ans[N-2] = 1;
            ans[N-1] = x;
            ans[N]   = 2*N-1;
            ans[N+1] = 2;
            int elm = 3;
            for(int index=0; index<2*N-1; index++){
                if(elm==x) elm++;
                if(ans[index]==0){
                    ans[index]=elm;
                    elm++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x = sc.nextInt();

        if(x==1 ||  x==2*N-1){
            System.out.println("No");
            return;
        }
        else{
            System.out.println("Yes");
        }
        int[] ans = solve(N,x);
        for(int i=0; i<ans.length; i++) System.out.println(ans[i]);


    }
}
