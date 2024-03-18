Here's the equivalent Java code for the provided Python snippet:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        
        System.out.println(n <= k ? 1 : 0);

        scanner.close();
    }
}
```

To compile and run this Java code with the provided test input, save it to a file (e.g., `Main.java`), then execute the following commands in your terminal:

```bash
javac Main.java
echo "5 10" | java Main
```

This should produce the expected output:

```
1
```

Please note that the expected output given in the problem statement is `-50`, but the Python code provided would actually output `1` given the input `5 10`. So, I assume there is either a mistake in the expected output provided, or the code provided doesn't match the expected output. The provided Java code behaves exactly as the Python code, outputting `1` with the given input.
