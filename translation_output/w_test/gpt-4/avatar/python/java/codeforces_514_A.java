```java
import java.util.Scanner;

public class PythonToJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip = sc.next();
        String st = "";

        if (ip.length() != 1) {
            if (ip.charAt(0) == '9') {
                st = "9";
                ip = ip.substring(1);
            }
            for (int i = 0; i < ip.length(); i++) {
                int digit = Character.getNumericValue(ip.charAt(i));
                if (digit > 4) {
                    int n = 9 - digit;
                    st += Integer.toString(n);
                } else {
                    st += ip.charAt(i);
                }
            }
        } else {
            st = ip;
        }
        System.out.println(Integer.parseInt(st));
    }
}
```

To run a test case for the input "5728" using Java, you can either:
1. Compile the above Java code and run it, entering the value when prompted, or 
2. Modify the code slightly to directly assign the test input as a string to the `ip` variable rather than reading from `System.in`. Here's how you might modify it for a quick test without user input:

```java
public class PythonToJava {
    public static void main(String[] args) {

        // Directly provide test input without using Scanner
        String ip = "5728"; // Test input
        String st = "";

        // Rest of the code remains unchanged...
        // ... Logic to generate output ...
        
        System.out.println(Integer.parseInt(st)); // Expected output: 4221
    }
}
```
