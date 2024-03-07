<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

N,A,B = map(int,input().split())
print(min(A,B),max(A+B-N,0))

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
        int minAB = Math.min(A, B);
        int maxAB = Math.max(A + B - N, 0);
        System.out.println(minAB + " " + maxAB);
    }
}
```
This code uses the `Scanner` class to read the input from the user, and the `Math.min` and `Math.max` methods to find the minimum and maximum values of `A` and `B`. The `System.out.println` method is used to print the result.</s>
