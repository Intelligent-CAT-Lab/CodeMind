import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int MOD = 1000000007;
        int i = 1;
        int M = N;
        ArrayList<Integer> div = new ArrayList<Integer>();
        while (i * i <= N) {
            if (N % i == 0) {
                div.add(i);
                if (N / i!= i) {
                    div.add(N / i);
                }
            }
            i += 1;
        }

        Collections.sort(div);
        int N1 = div.size();
        int[] num = new int[N1 + 1];
        int ans = 0;
        for (int i = 0; i < N1; i++) {
            num[i] = (int) Math.pow(K, (div.get(i) + 1) / 2, MOD);
            for (int j = 0; j < i; j++) {
                if (div.get(i) % div.get(j) == 0) {
                    num[i] = num[i] - num[j] + MOD;
                    num[i] %= MOD;
                }
            }

            if (div.get(i) % 2 == 0) {
                ans += div.get(i) * num[i] / 2;
                ans %= MOD;
            } else {
                ans += div.get(i) * num[i];
                ans %= MOD;
            }
        }

        System.out.println(ans);
    }
}