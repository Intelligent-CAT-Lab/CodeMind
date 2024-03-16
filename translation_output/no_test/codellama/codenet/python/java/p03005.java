<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

N,K=map(int,input().split())
if K==1:
    print(0)
else:
    print(N-K)

Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        if (K == 1) {
            System.out.println(0);
        } else {
            System.out.println(N - K);
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `System.out.println()` method to print the result. The `if` statement is used to check if `K` is equal to 1, and if it is, the code prints 0. Otherwise, it prints `N - K`.</s>
