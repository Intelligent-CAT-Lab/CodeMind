Here is the Java equivalent of the given Python code, which calculates the number of bits required to represent a non-negative integer. Note that in Java, the input is taken from the command line arguments in this example, so the "input" must be provided when running the program.

```java
public class NumberOfBits {
    public static void main(String[] args) {
        // Assuming the input number is passed as a command line argument
        int n = Integer.parseInt(args[0]);
        int numBits = (n > 0) ? Integer.toBinaryString(n).length() : 0;
        System.out.println(numBits);
    }
}
```

To run this with a test input of 0 as you've provided, you'll have to compile and run the program, passing the test input as a command-line argument, like so:

```shell
javac NumberOfBits.java
java NumberOfBits 0
```

This should output `0` as expected from the provided test case.

However, the expected output based on your test case is `14`, which does not seem to match the Python code's intended behavior for an input of `0`. If, by any chance, the expected output of `14` is a mistake, then the Java code above will work fine for the input `0` giving an output of `0`. If the expected output is indeed correct, please double-check the Python code or clarify the discrepancy.
