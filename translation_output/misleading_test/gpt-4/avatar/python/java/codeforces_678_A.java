Here is the Java translation of your provided Python code:

```java
import java.util.Scanner;

public class DivisibleNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long vamshi = scanner.nextLong();
        long z = scanner.nextLong();
        long result = (vamshi / z + 1) * z;
        System.out.println(result);
    }
}
```

To run this Java program, you would compile it with `javac DivisibleNumber.java` and then execute it with `java DivisibleNumber`. When prompted, you'd enter the test input "999999999 1", and it should output `1000000003` as expected.
