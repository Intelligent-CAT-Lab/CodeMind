<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
30

Expected output:
 3 6 9 12 13 15 18 21 23 24 27 30


```
n = int(input())
A = list()
for i in range(1,n+1):
    if i % 3 == 0:
        A.append(i)
    elif "3" in str(i):
        A.append(i)
print(" ", end="")
for i in range(len(A)-1):
    print(A[i], end=" ")
print(A[len(A)-1])


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int[] A = new int[n];
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || String.valueOf(i).contains("3")) {
                A[i - 1] = i;
            }
        }

        for (int i = 0; i < A.length - 1; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println(A[A.length - 1]);
    }
}
```
This code first takes an integer input `n` from the user using the `Scanner` class. Then, it creates an array `A` of size `n` and initializes it with all zeros.

Next, it iterates over the range of numbers from 1 to `n` and checks if each number is divisible by 3 or if it contains the digit 3. If either of these conditions is true, the number is added to the array `A`.

Finally, the code prints the contents of the array `A` separated by spaces, except for the last element, which is printed on a new line.

Note that the code uses the `String.valueOf(i)` method to convert the integer `i` to a string, and the `String.contains("3")` method to check if the string contains the digit 3.</s>
