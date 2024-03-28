Here is the equivalent Java code for the provided Python script. The Java code reads an integer from standard input and translates it into a sequence of letters according to the Python script's algorithm:

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        StringBuilder res = new StringBuilder();
        
        while (N > 0) {
            N--; // Since the alphabet starts at 'a', we decrement first
            res.append((char) ('a' + N % 26));
            N /= 26;
        }
        
        // Reverse the result string and output it
        System.out.println(res.reverse().toString());
    }
}
```

To use this Java program, enter the input value (in this case `2`) into the standard input after running the program. The expected output will be `b` as per the given test case.

This Java code includes the necessary imports and takes care of reading the input, performing the conversion, and printing the output just as the original Python script does. Note that Java performs integer division by default, so the line `N /= 26;` works the same as `N //= 26` in Python.
