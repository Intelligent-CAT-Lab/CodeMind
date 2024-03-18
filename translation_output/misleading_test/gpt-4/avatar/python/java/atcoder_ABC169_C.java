Here's the equivalent Java code for the provided Python snippet:

```java
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        String aString = inputs[0];
        String bString = inputs[1].charAt(0) + inputs[1].substring(2);
        
        BigInteger a = new BigInteger(aString);
        BigInteger b = new BigInteger(bString);
        BigInteger hundred = new BigInteger("100");

        BigInteger result = a.multiply(b).divide(hundred);
        System.out.println(result.toString());
    }
}
```

Here's a sample test case that you can run to test the code:

Test input:
814793613347395 1.99

Expected output:
1621439290561408

Make sure that the Java class is appropriately named—here, I have named it `Main`. If you are running this in an environment with a specific class name requirement, you might need to adjust the class name accordingly.
