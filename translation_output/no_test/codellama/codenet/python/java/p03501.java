<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

N,A,B=map(int,input().split())

print(min(A*N,B))

Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(Math.min(A * N, B));
    }
}
```
This code uses the `Scanner` class to read the input from the user, and the `Math.min()` method to find the minimum of the two values.</s>
