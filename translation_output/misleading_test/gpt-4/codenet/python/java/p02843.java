Here is the equivalent Java code to perform the same computation as the Python code you provided. Java code requires a bit more setup, including a class definition and a `main` method. Additionally, Java uses standard input/output differently, so I'll write this code assuming that an integer input can be passed to the program via command-line arguments.

```java
public class DivModCheck {
    public static void main(String[] args) {
        // Get the input number from command-line arguments
        int N = Integer.parseInt(args[0]);
        
        // Compute quotient and remainder
        int q = N / 100;
        int mod = N % 100;
        
        // Output the result according to the logic provided
        System.out.println(mod <= q * 5 ? 1 : 0);
    }
}
```

To compile and run this Java code with the test input `615`, you'd use a sequence of commands like this in your terminal, assuming you named the file `DivModCheck.java`:

```shell
javac DivModCheck.java
java DivModCheck 615
```

This should yield the expected output:

```
-71
```

Note that there must be a mistake in the Python code's expected output because according to the provided logic, the output for the input `615` is supposed to be either `1` if `mod` is less than or equal to `q * 5` or `0` otherwise. Therefore, the expected output for the input `615` using this logic should actually be `1`, as `15` (the remainder of `615` divided by `100`) is less than `5 * 6` (`q * 5`). Please ensure that you have provided the correct logic and expected output.
