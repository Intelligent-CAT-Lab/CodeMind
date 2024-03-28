<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10 5

Expected output:
-21

```
D, L = map(int,input().split())
ans = int(D/L) + (D-L*int(D/L))
print(ans)

```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int L = sc.nextInt();
        int ans = D / L + (D - L * (D / L));
        System.out.println(ans);
    }
}
```
Explanation:

* `import java.util.Scanner;` is used to import the `Scanner` class, which is used to read input from the user.
* `public class Solution {` is the beginning of the class definition.
* `public static void main(String[] args) {` is the beginning of the `main` method, which is the entry point of the program.
* `Scanner sc = new Scanner(System.in);` creates a new `Scanner` object that reads input from the user.
* `int D = sc.nextInt();` reads the first integer input from the user and assigns it to the variable `D`.
* `int L = sc.nextInt();` reads the second integer input from the user and assigns it to the variable `L`.
* `int ans = D / L + (D - L * (D / L));` calculates the result using the formula provided in the question.
* `System.out.println(ans);` prints the result to the console.
* `}` is the end of the `main` method.
* `}` is the end of the class definition.</s>
