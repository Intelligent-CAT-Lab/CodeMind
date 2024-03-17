<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 998244353

Expected output:
6


```
from numpy import*
n,M=map(int,input().split())
l=n*3+1
d=zeros((l,n*5),int64)
d[0][0]=1
for i in range(1,l):j,k=i-1,i-2;d[i]=((d[i-3]*k+roll(d[k],-1))*j+roll(d[j],1))%M
print(sum(d[-1][:l])%M)
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int M = sc.nextInt();
        int l = n * 3 + 1;
        int[][] d = new int[l][n * 5];
        d[0][0] = 1;
        for (int i = 1; i < l; i++) {
            int j = i - 1;
            int k = i - 2;
            d[i] = ((d[i - 3] * k + roll(d[k], -1)) * j + roll(d[j], 1)) % M;
        }
        System.out.println(sum(d[-1][:l]) % M);
    }

    public static int roll(int[] arr, int n) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[(i + n) % arr.length] = arr[i];
        }
        return result;
    }

    public static int sum(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        return result;
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `Math` class to perform mathematical operations. The `roll` method is used to rotate the elements of an array by a given number of positions. The `sum` method is used to calculate the sum of the elements of an array.

The code first reads the input `n` and `M` from the user, and then initializes the `d` array with the value `1` in the first position. It then loops through the remaining positions of the `d` array, calculating the value of each position using the formula provided in the problem statement. Finally, it prints the sum of the last row of the `d` array modulo `M`.</s>
