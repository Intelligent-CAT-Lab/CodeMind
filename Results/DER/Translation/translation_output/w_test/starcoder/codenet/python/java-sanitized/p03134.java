import java.util.*;
import java.io.*;

public class p03134 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] lis = new int[2*N+1];
        lis[0] = 1;
        int R = 0, B = 0;
        for (int i = 0; i < N; i++) {
            String s = sc.next();
            if (s.equals("0")) {
                R += 2;
            } else if (s.equals("1")) {
                R += 1;
                B += 1;
            } else {
                B += 2;
            }
            int[] nlis = new int[2*N+1];
            for (int j = 0; j < 2*N; j++) {
                if (j < R) {
                    nlis[j+1] += lis[j];
                    nlis[j+1] %= 998244353;
                }
                if (j-i < B) {
                    nlis[j] += lis[j];
                    nlis[j] %= 998244353;
                }
            }
            lis = nlis;
        }
        for (int i = 0; i < N; i++) {
            int[] nlis = new int[2*N+1];
            for (int j = 0; j < 2*N; j++) {
                if (j < R) {
                    nlis[j+1] += lis[j];
                    nlis[j+1] %= 998244353;
                }
                if (j-i < B) {
                    nlis[j] += lis[j];
                    nlis[j] %= 998244353;
                }
            }
            lis = nlis;
        }
        System.out.println(Arrays.stream(lis).sum() % 998244353);
    }
}