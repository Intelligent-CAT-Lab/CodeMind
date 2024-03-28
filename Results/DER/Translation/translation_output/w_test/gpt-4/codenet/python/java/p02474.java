Here is the translation of the provided Python code to Java, along with the sample test case:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] parts = input.split(" ");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        System.out.println(a * b);
        sc.close();
    }
}
```

This Java program should give you the expected output of 40 for the test input "5 8". Remember that unlike the Python program provided, Java requires a main method encapsulated in a class for the execution to begin, alongside importing the necessary classes—in this case, Scanner for input handling.
