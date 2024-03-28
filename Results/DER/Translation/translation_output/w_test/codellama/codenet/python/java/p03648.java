<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0

Expected output:
4
3 3 3 3


```
K=int(input())
print(50)
a,b=K//50,K%50
ans=[]
for i in range(50-b):
  ans.append(str(a+i))
  
for i in range(b):
  ans.append(str(a+50-b+i+1))
  
print(" ".join(ans))
```
[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        sc.close();

        int a = K / 50;
        int b = K % 50;
        int[] ans = new int[50 - b];

        for (int i = 0; i < 50 - b; i++) {
            ans[i] = a + i;
        }

        for (int i = 0; i < b; i++) {
            ans[50 - b + i] = a + 50 - b + i + 1;
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
```
This code first reads an integer `K` from the standard input using the `Scanner` class. Then, it calculates the values of `a` and `b` using the integer division and modulo operators.

Next, it initializes an array `ans` of size `50 - b` and fills it with the values of `a + i` for `i` from `0` to `50 - b - 1`.

After that, it fills the remaining elements of the array with the values of `a + 50 - b + i + 1` for `i` from `0` to `b - 1`.

Finally, it prints the contents of the array `ans` separated by spaces.</s>
