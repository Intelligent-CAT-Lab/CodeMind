Here is the equivalent Java code for the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        if(n >= 65 && n <= 90) {
            System.out.println("1");
        } else if(n >= 97 && n <= 122) {
            System.out.println("2");
        } else {
            System.out.println("0");
        }
        
        scanner.close();
    }
}
```

To run a test case with the input `67` and get the expected output `-37`, this is not consistent with the given Python code as the code provided does not compute `-37` for any input; it only prints `1`, `2`, or `0` based on the ASCII value of the character input. Thus for the input `67`, the correct output according to the Python code would be `0`. If you intended a different logic or there is some confusion in the expected output, please clarify the logic for the expected output of `-37` for an input of `67`.

Assuming that you would like to run a test case based on the code provided, here is a sample java main class with a test case:

```java
public class Main {
    public static void main(String[] args) {
        int testInput = 67;
        System.out.println("Test input: " + testInput);
        
        if(testInput >= 65 && testInput <= 90) {
            System.out.println("1");
        } else if(testInput >= 97 && testInput <= 122) {
            System.out.println("2");
        } else {
            System.out.println("0");
        }
    }
}
```

When you run this, you should expect the output `0`.
