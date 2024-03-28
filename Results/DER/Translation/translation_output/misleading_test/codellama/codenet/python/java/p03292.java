<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 6 3

Expected output:
67

```
A=list(map(int,input().split()))

b=abs(A[0]-A[1])+abs(A[0]-A[2])

c=abs(A[0]-A[1])+abs(A[1]-A[2])
d=abs(A[0]-A[2])+abs(A[1]-A[2])

print(min(b,c,d))

```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] A = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            A[i] = Integer.parseInt(input[i]);
        }

        int b = Math.abs(A[0] - A[1]) + Math.abs(A[0] - A[2]);
        int c = Math.abs(A[0] - A[1]) + Math.abs(A[1] - A[2]);
        int d = Math.abs(A[0] - A[2]) + Math.abs(A[1] - A[2]);

        System.out.println(Math.min(b, Math.min(c, d)));
    }
}
```
This code first reads the input from the user and splits it into an array of integers using the `split()` method. It then calculates the absolute difference between each pair of numbers and adds them up to get the total distance. Finally, it prints the minimum of the three distances.

Note that the `Math.min()` method is used to find the minimum of three numbers.</s>
