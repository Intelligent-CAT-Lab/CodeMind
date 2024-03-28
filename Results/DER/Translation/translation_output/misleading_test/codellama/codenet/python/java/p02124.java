<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0

Expected output:
a{1383

```
print("ai1333" + "3" * int(int(input()) / 100))

```
[/INST]
```java
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        String output = "a" + "1333" + "3".repeat(input / 100);
        System.out.println(output);
    }
}
```
Explanation:

* `Scanner scanner = new Scanner(System.in);` creates a new `Scanner` object that reads input from the standard input stream.
* `int input = scanner.nextInt();` reads the next integer from the input stream and stores it in the `input` variable.
* `String output = "a" + "1333" + "3".repeat(input / 100);` concatenates the strings "a", "1333", and "3" repeated `input / 100` times using the `repeat` method.
* `System.out.println(output);` prints the resulting string to the standard output stream.

Note: The `repeat` method is a Java 11 feature, so if you are using an earlier version of Java, you will need to use a different method to repeat the string.</s>
