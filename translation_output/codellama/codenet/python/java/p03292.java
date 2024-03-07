<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

A=list(map(int,input().split()))

b=abs(A[0]-A[1])+abs(A[0]-A[2])

c=abs(A[0]-A[1])+abs(A[1]-A[2])
d=abs(A[0]-A[2])+abs(A[1]-A[2])

print(min(b,c,d))


Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[3];
        for (int i = 0; i < 3; i++) {
            A[i] = scanner.nextInt();
        }
        int b = Math.abs(A[0] - A[1]) + Math.abs(A[0] - A[2]);
        int c = Math.abs(A[0] - A[1]) + Math.abs(A[1] - A[2]);
        int d = Math.abs(A[0] - A[2]) + Math.abs(A[1] - A[2]);
        System.out.println(Math.min(b, c, d));
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `Math` class to perform mathematical operations. The `Math.abs()` method is used to calculate the absolute value of the differences between the three numbers, and the `Math.min()` method is used to find the minimum of the three values. Finally, the result is printed to the console using `System.out.println()`.</s>
