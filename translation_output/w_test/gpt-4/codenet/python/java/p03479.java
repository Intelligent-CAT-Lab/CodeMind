Here is the Python code translated into Java:

```java
import java.util.Scanner;

public class Doubling {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        int count = 1;
        long x = a;

        while (x * 2 <= b) {
            x = x * 2;
            count += 1;
        }

        System.out.println(count);

        input.close();
    }
}
```

This Java program should output `3` when given the test input `3 20`. To run this test case, you can use the command line to compile the program with `javac Doubling.java` and then run it with `java Doubling`. When prompted, type `3 20` and press Enter to see the expected output.
