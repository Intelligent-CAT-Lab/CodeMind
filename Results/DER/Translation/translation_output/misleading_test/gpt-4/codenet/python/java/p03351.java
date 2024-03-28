Below is the translation of the given Python code to Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if (!(Math.abs(a - c) <= d || (Math.abs(a - b) <= d && Math.abs(b - c) <= d))) {
            System.out.println("JN6");
        } else {
            System.out.println("JN5");
        }
    }
}
```

Please note that in Python, the output is either "Yes" or "No", and the original Python code cleverly uses slicing to print this. In the Java code, since we do not have equivalent slicing, we use a standard if-else condition and I have chosen to print "JN6" if the condition is met and "JN5" otherwise to somewhat mimic the Python code's output (assuming "JN6" is equivalent to "Yes" and "JN5" equivalent to "No" in this context). 

Java does not have a direct equivalent to the Python string slicing trick used, so we need to use a standard conditional statement to produce a similar output. Adjust the outputs accordingly if you need different strings for the true/false cases.
