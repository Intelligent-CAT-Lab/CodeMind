<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
8 8

Expected output:
1


```
t , h = map ( int , input ( ) . split ( ) )
print ( ( h - 2 ) // ( t - 1 ) + 1 )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int h = scanner.nextInt();
        System.out.println((h - 2) / (t - 1) + 1);
    }
}
```
Explanation:

* `import java.util.Scanner;` imports the `Scanner` class from the `java.util` package, which is used to read input from the user.
* `public class Solution {` declares a new class called `Solution`.
* `public static void main(String[] args) {` declares the `main` method, which is the entry point of the program.
* `Scanner scanner = new Scanner(System.in);` creates a new `Scanner` object that reads input from the user.
* `int t = scanner.nextInt();` reads the first integer input from the user and assigns it to the variable `t`.
* `int h = scanner.nextInt();` reads the second integer input from the user and assigns it to the variable `h`.
* `System.out.println((h - 2) / (t - 1) + 1);` calculates the result using the formula provided in the problem statement and prints it to the console.
* `}` closes the `main` method.
* `}` closes the `Solution` class.</s>
