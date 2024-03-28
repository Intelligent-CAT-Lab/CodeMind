<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
8

Expected output:
1000
11111111111111111111111111110111
10000
100
17

```
n = int(input())
mask = (1<<32)-1
print('{:032b}'.format(n))
print('{:032b}'.format(~n & mask))
print('{:032b}'.format((n<<1)& mask))
print('{:032b}'.format((n>>1)& mask))

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int mask = (1 << 32) - 1;
        System.out.println(String.format("%032b", n));
        System.out.println(String.format("%032b", ~n & mask));
        System.out.println(String.format("%032b", (n << 1) & mask));
        System.out.println(String.format("%032b", (n >> 1) & mask));
    }
}
```
Explanation:

* `import java.util.Scanner;` imports the `Scanner` class from the `java.util` package, which is used to read input from the user.
* `public class Main {` declares a class called `Main`.
* `public static void main(String[] args) {` declares a method called `main` that takes an array of strings as input and returns nothing.
* `Scanner scanner = new Scanner(System.in);` creates a new `Scanner` object that reads input from the user.
* `int n = scanner.nextInt();` reads an integer from the user and assigns it to the variable `n`.
* `int mask = (1 << 32) - 1;` creates a mask that has 32 ones in its binary representation.
* `System.out.println(String.format("%032b", n));` prints the binary representation of `n` with 32 leading zeros.
* `System.out.println(String.format("%032b", ~n & mask));` prints the binary representation of `~n & mask` with 32 leading zeros.
* `System.out.println(String.format("%032b", (n << 1) & mask));` prints the binary representation of `(n << 1) & mask` with 32 leading zeros.
* `System.out.println(String.format("%032b", (n >> 1) & mask));` prints the binary representation of `(n >> 1) & mask` with 32 leading zeros.

Note: The `String.format()` method is used to format the output as a binary string with 32 leading zeros. The `%032b` format specifier tells `String.format()` to pad the output with leading zeros to a total of 32 characters.</s>
