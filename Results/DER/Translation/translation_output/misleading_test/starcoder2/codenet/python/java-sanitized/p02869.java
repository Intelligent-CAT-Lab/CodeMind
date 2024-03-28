import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int flag[] = new int[2*N];
        for(int i=0;i<2*N;i++)
            flag[i] = 1;
        for(int i=N/2;i<N;i++)
        {
            int a = K+i;
            int b = K+2*N-1-(i-N/2)*2;
            int c = K+3*N-1-(i-N/2);
            System.out.println(a+" "+b+" "+c);
        }
        for(int i=0;i<N/2;i++)
        {
            int a = K+i;
            int b = K+2*N-2-i*2;
            int c = K+3*N-1-i-N/2;
            System.out.println(a+" "+b+" "+c);
        }
    }
}