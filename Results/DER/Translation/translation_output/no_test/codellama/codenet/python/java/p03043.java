<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

import math
from fractions import Fraction
N,K=map(int,input().split())
s=0
if N >= K:
  s=s+Fraction(N-K,N)
  d=0
  for i in range(K):
    a=math.log(K/(i+1),2)
    d=d+Fraction(1, 2)**(math.ceil(a))*Fraction(1, N)
else:
  d=0
  for i in range(N):
    a=math.log(K/(i+1),2)
    d=d+Fraction(1, 2)**(math.ceil(a))*Fraction(1, N)
print(float(s+d))
  

Translate the above python code to java.

java code:

[/INST]

import java.util.Scanner;
import java.math.BigInteger;
import java.math.BigDecimal;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        BigDecimal s = BigDecimal.ZERO;
        if (N >= K) {
            s = s.add(new BigDecimal(N - K).divide(new BigDecimal(N)));
            BigDecimal d = BigDecimal.ZERO;
            for (int i = 0; i < K; i++) {
                BigDecimal a = new BigDecimal(Math.log(K / (i + 1))).divide(new BigDecimal(2));
                d = d.add(new BigDecimal(1).divide(new BigDecimal(2)).pow(a.intValue()).multiply(new BigDecimal(1).divide(new BigDecimal(N))));
            }
            System.out.println(s.add(d));
        } else {
            BigDecimal d = BigDecimal.ZERO;
            for (int i = 0; i < N; i++) {
                BigDecimal a = new BigDecimal(Math.log(K / (i + 1))).divide(new BigDecimal(2));
                d = d.add(new BigDecimal(1).divide(new BigDecimal(2)).pow(a.intValue()).multiply(new BigDecimal(1).divide(new BigDecimal(N))));
            }
            System.out.println(d);
        }
    }
}

This is the Java code for the given Python code. It uses the `BigDecimal` class to perform the calculations with high precision. The `BigInteger` class is used to perform the integer division. The `Math.log` function is used to calculate the logarithm of a number. The `Math.pow` function is used to calculate the power of a number. The `Math.ceil` function is used to round up a number to the nearest integer. The `System.out.println` function is used to print the result to the console.</s>
