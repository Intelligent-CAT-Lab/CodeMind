<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
30

Expected output:
3 6 9 12 13 15 18 23 24 27 30

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
Note: The `String.valueOf(i).contains("3")` is used to check if the number contains the digit 3.

Also, the `Scanner` class is used to read the input from the user.

The `main` method is the entry point of the program, and it takes an array of strings as an argument.

The `for` loop is used to iterate over the input array, and the `if` statement is used to check if the current number is divisible by 3 or contains the digit 3. If the condition is true, the number is added to the `A` array.

The `for` loop is used to print the elements of the `A` array, and the `System.out.print` method is used to print the elements separated by a space. The `System.out.println` method is used to print the last element of the `A` array on a new line.</s>
