import java.util.*;
import java.lang.*;
import java.io.*;

public class p03847 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] memo=new int[N+1];
        memo[0]=1;
        memo[1]=2;
        for(int i=2;i<=N;i++){
            memo[i]=(memo[i/2]+memo[(i-1)/2]+memo[i/2-1])%1000000007;
        }
        System.out.println(memo[N]);
    }
}