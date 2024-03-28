<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10 3 5

Expected output:
5 -69

```
N,A,B = map(int,input().split())
print(min(A,B),max(A+B-N,0))
```
[/INST]
```java
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
This code uses the `Scanner` class to read input from the user, and the `Math.min` and `Math.max` methods to find the minimum and maximum values of `A` and `B`. The output is then printed to the console.

Note that the `Scanner` class is used to read input from the user, and the `Math.min` and `Math.max` methods are used to find the minimum and maximum values of `A` and `B`. The output is then printed to the console.</s>
