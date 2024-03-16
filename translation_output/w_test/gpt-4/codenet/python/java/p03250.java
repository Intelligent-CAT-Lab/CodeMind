Certainly! Below is the Java equivalent of the provided Python code:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputs = sc.nextLine().split(" ");
        int[] abc = new int[3];
        for (int i = 0; i < 3; i++) {
            abc[i] = Integer.parseInt(inputs[i]);
        }
        Arrays.sort(abc);
        int result = Integer.parseInt("" + abc[2] + abc[1]) + abc[0];
        System.out.println(result);
    }
}
```

The Java code does the following:
- Creates a `Scanner` instance to read from the standard input.
- Reads a line of text and splits it into a string array based on spaces.
- Converts the string array to an integer array.
- Sorts the integer array.
- Concatenates the largest and second largest numbers as strings, then parses it to an integer, adds the smallest number, and prints the result.

You can compile and run this Java code to get the expected output for your case. Given the test input `1 5 2`, the output would be `53`.
