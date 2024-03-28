Below is the translation of the provided Python code into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        scanner.close();
        
        String[] parts = line.split(" ");
        long n = Long.parseLong(parts[0] + parts[1]);
        long sqrtn = (long) Math.sqrt(n);
        boolean isPerfectSquare = false;
        
        for (long i = 1; i <= sqrtn; i++) {
            if (i * i == n) {
                isPerfectSquare = true;
                break;
            }
        }
        
        System.out.println(isPerfectSquare ? "Yes" : "No");
    }
}
```

To compile and run this code with the sample test case, follow these steps:

1. Save the code in a file named `Main.java`.
2. Open a terminal or command prompt and navigate to the location of `Main.java`.
3. Compile the Java program with the command:

```
javac Main.java
```

4. To run the program and provide the sample test input (`1 21`), you can either run:

```
echo "1 21" | java Main
```

This will output:

```
Yes
```

Or you can manually run the program with `java Main` and then type `1 21` followed by the Enter key.
