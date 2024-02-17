import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int res = 1,sum=1;
        while(sum<=N){
            if(sum==N) break;
            res++;
            sum += res;
        }
        if(sum>N) {
            sum -= res;
            res--;
        }
        int[] ans = new int[res+1];
        for(int i=1;i<=res;i++) ans[i]=i;
        int len = N-sum;
        for(int j=res;j>=res+1-len;j--) ans[j]++;
        PrintWriter out = new PrintWriter(System.out);
        for(int i=1;i<=res;i++) out.println(ans[i]);
        out.flush();
    }
}
