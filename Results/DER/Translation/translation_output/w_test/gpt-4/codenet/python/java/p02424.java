Certainly! Below is the Python code translated into Java:

```java
import java.util.Scanner;

public class BitwiseOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(String.format("%032d", Integer.parseInt(Integer.toBinaryString(a & b))));
        System.out.println(String.format("%032d", Integer.parseInt(Integer.toBinaryString(a | b))));
        System.out.println(String.format("%032d", Integer.parseInt(Integer.toBinaryString(a ^ b))));
    }
}
```

Now, you can test this Java program with the following input: `8 10`, and you should get the expected output as per your test case.

Please note that `Integer.toBinaryString()` method in Java does not pad with zeros to ensure the string is 32 characters long. So, we convert the binary string to an integer and then format it with the leading zeros.
