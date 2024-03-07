<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

#Dåé¡
#Dåé¡
import math
N=int(input())
n=int(math.sqrt(N))
plist=[]
for i in range(1,n+1):
    if N%i == 0:
        plist.append(i)
        if i != int(N/i):
            plist.append(int(N/i))
ans=0
for i in range(len(plist)):
    x=plist[i]
    kari=int(N/x)-1
    if kari == 0:
        pass
    else:
        q=int(N/kari)
        r=N%kari
        if q == r:
            ans+=kari
print(ans)
            


Translate the above python code to java.

java code:

[/INST]

import java.util.Scanner;
import java.lang.Math;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int n = (int) Math.sqrt(N);
        int[] plist = new int[n];
        for (int i = 1; i <= n; i++) {
            if (N % i == 0) {
                plist[i] = i;
                if (i != N / i) {
                    plist[i] = N / i;
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < plist.length; i++) {
            int x = plist[i];
            int kari = (int) (N / x) - 1;
            if (kari == 0) {
                continue;
            } else {
                int q = (int) (N / kari);
                int r = N % kari;
                if (q == r) {
                    ans += kari;
                }
            }
        }
        System.out.println(ans);
    }
}

This is the Java code for the given Python code. The code first takes an input from the user and stores it in the variable `N`. Then, it calculates the square root of `N` and stores it in the variable `n`.

The code then creates an array `plist` of size `n` and initializes it with the values of `i` such that `N % i == 0`. If `i` is not equal to `N / i`, then it also adds `N / i` to the array.

The code then calculates the sum of all the elements in the array `plist` that satisfy the condition `q == r`, where `q` and `r` are the quotient and remainder of `N / x` and `N % x`, respectively.

Finally, the code prints the sum of all the elements in the array `plist` that satisfy the condition `q == r`.</s>
