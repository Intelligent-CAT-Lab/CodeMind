<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
111

Expected output:
111


```
N=int(input())
X=P=0
for i in range(10) :
  P=i*111
  if X < N and N <= P :
    print(P)
  X=P
    
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = 0, P = 0;
        for (int i = 1; i <= 10; i++) {
            P = i * 111;
            if (X < N && N <= P) {
                System.out.println(P);
            }
            X = P;
        }
    }
}
```
This code uses a `Scanner` object to read the input from the user, and then it uses a `for` loop to iterate over the numbers from 1 to 10. For each number, it calculates the product of that number and 111, and then it checks if the product is greater than or equal to the input number. If it is, it prints the product.

The code also uses two variables, `X` and `P`, to keep track of the previous product and the current product, respectively. The `X` variable is initialized to 0, and the `P` variable is initialized to the product of the current number and 111. The `X` variable is updated to the value of `P` at the end of each iteration, so that it always contains the previous product.

The code also uses the `&&` operator to check if both conditions are true. If the first condition is false, the second condition is not evaluated, which is known as "short-circuiting". This is a common optimization technique in Java, as it can save time and resources by avoiding unnecessary computations.</s>
