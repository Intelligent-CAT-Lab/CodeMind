Here's the equivalent Java code for the same operation, including reading from standard input. I'm assuming we'll use the Scanner class for input, and System.out.println for output:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println((a - 1) * (b - 1));
        sc.close();
    }
}
```
To run the above Java code, you'd typically compile it using a Java compiler like so:
```shell
javac Main.java
```
And then run the compiled class with the Java interpreter:
```shell
java Main
```
You'd then provide your test input (`2 2`) in the console, and it should output `1` as expected.

