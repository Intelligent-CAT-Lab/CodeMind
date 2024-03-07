<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

import sys
import random

def rd():
        return sys.stdin.readline().rstrip()

def rdi():
        return [ int(x) for x in rd().split() ]

N, K = rdi()

#N, K = 5, 2
#N, K = 10, 0
#N, K = 31415, 9265

s = 0
for b in range(K+1, N+1):
        an = 0
        j = N / b
        an = j * (b - K)
        #print b, an
        if N % b > 0:
                x1 = j * b + K
                if K == 0:
                        x1 += 1
                x2 = min(N, (j+1) * b - 1)
                #print b, x1, x2
                if x2 >= x1:
                        an += (x2 - x1 + 1)
        s += an
        #print b, an
print s


Translate the above python code to java.

java code:

[/INST]

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int s = 0;
        for (int b = K + 1; b <= N; b++) {
            int an = 0;
            int j = N / b;
            an = j * (b - K);
            if (N % b > 0) {
                int x1 = j * b + K;
                if (K == 0) {
                    x1 += 1;
                }
                int x2 = Math.min(N, (j + 1) * b - 1);
                if (x2 >= x1) {
                    an += (x2 - x1 + 1);
                }
            }
            s += an;
        }
        System.out.println(s);
    }
}

Note: The above code is written in Java 8, and it uses the `Scanner` class to read input from the user. The `Math.min` method is used to find the minimum of two numbers.</s>
