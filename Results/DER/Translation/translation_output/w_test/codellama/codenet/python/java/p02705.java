<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1

Expected output:
6.28318530717958623200


```
print(int(input())*6.28)
```
[/INST]
```java
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        double result = input * 6.28;
        System.out.println(result);
    }
}
```
This code reads an integer from the user using the `Scanner` class, multiplies it by 6.28, and then prints the result to the console.

Here's a breakdown of the code:

* `Scanner scanner = new Scanner(System.in);`: This line creates a new `Scanner` object that reads input from the user. The `System.in` parameter specifies that the input should come from the standard input stream (i.e., the user's keyboard).
* `int input = scanner.nextInt();`: This line reads an integer from the user using the `nextInt()` method of the `Scanner` class. The `nextInt()` method returns the next integer in the input stream, or throws an exception if the input is not an integer.
* `double result = input * 6.28;`: This line multiplies the input integer by 6.28 and stores the result in a `double` variable.
* `System.out.println(result);`: This line prints the result to the console using the `println()` method of the `System.out` object.

Note that the `Scanner` class is part of the `java.util` package, so you'll need to import it at the top of your file:
```java
import java.util.Scanner;
```</s>
