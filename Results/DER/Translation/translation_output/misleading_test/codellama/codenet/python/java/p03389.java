<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 5 4

Expected output:
-14

```
A, B, C = list(map(int, input().split()))

a = sorted([A, B, C])
s = 0

for i in range(0, 2):
    tmp = a[2] - a[i]
    
    s += tmp // 2
    a[i] += tmp // 2 * 2

s += sum(a) % 3

print(s)
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int[] a = new int[]{A, B, C};
        int s = 0;
        for (int i = 0; i < 2; i++) {
            int tmp = a[2] - a[i];
            s += tmp / 2;
            a[i] += tmp / 2 * 2;
        }
        s += sum(a) % 3;
        System.out.println(s);
    }

    private static int sum(int[] a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }
}
```
This code first reads the input from the user and stores it in the variables A, B, and C. It then creates an array called a and initializes it with the values of A, B, and C.

The for loop iterates over the first two elements of the array and calculates the difference between the third element and the current element. It then adds the difference to the sum variable s and updates the current element by adding the difference multiplied by 2.

Finally, the code calculates the sum of the elements in the array and adds the result to the sum variable s. It then prints the value of s.

Note that the code uses the sum() method to calculate the sum of the elements in the array, which is a built-in method in Java.</s>
