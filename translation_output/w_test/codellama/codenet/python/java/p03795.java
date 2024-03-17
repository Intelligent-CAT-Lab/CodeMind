<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
20

Expected output:
15800


```
N = int(input())
print(800*N-200*(N//15))
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 800*N-200*(N/15);
        System.out.println(result);
    }
}
```
Explanation:

* `import java.util.Scanner;` is used to import the `Scanner` class, which is used to read input from the user.
* `public class Solution {` is the beginning of the class definition.
* `public static void main(String[] args) {` is the beginning of the `main` method, which is the entry point of the program.
* `Scanner sc = new Scanner(System.in);` creates a new `Scanner` object that reads input from the user.
* `int N = sc.nextInt();` reads an integer from the user and assigns it to the variable `N`.
* `int result = 800*N-200*(N/15);` calculates the result using the formula provided in the problem statement.
* `System.out.println(result);` prints the result to the console.
* `}` is the end of the `main` method.
* `}` is the end of the class definition.</s>
