Below is the Java translation of the given Python code, including code to take input from the console and output the result to the console:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println(num * 32);
        scanner.close();
    }
}
```

The described test case would look like this when run:

```
Enter a number: 4
128
```

One thing to note is that the expected output you provided, "81," seems to be incorrect based on the given Python code which multiplies the input by `32`. Therefore, if you input `4`, the expected output should be `128`, not `81`. If the provided expected output is indeed a requirement, then the operation in the code might need to be different from multiplication by `32`.

