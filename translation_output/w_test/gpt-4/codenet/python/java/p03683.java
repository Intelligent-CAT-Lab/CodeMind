Below is the equivalent Java code for the provided Python code. Please note that in Java, you will need to include a Scanner for input and handle possible exceptions that may occur when reading from standard input (which is not shown in the provided Python code):

```java
import java.util.Scanner;

public class Main {
    final static long THRES = 1000000007L;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] buf = scanner.nextLine().split("\\s");
        int N = Integer.parseInt(buf[0]);
        int M = Integer.parseInt(buf[1]);
        
        if (Math.abs(N - M) == 1) {
            N = Math.min(N, M);
            long retVal = 1;
            for (int i = 1; i <= N; i++) {
                retVal *= (long)i * i;
                if (retVal >= THRES) {
                    retVal = retVal % THRES;
                }
            }
            retVal *= (N + 1);
            if (retVal >= THRES) {
                retVal = retVal % THRES;
            }
            System.out.println(retVal);
        } else if (N == M) {
            long retVal = 2;
            for (int i = 1; i <= N; i++) {
                retVal *= (long)i * i;
                if (retVal >= THRES) {
                    retVal = retVal % THRES;
                }
            }
            System.out.println(retVal);
        } else {
            System.out.println(0);
        }
        
        scanner.close();
    }
}
```

This Java program assumes that the input is provided in the same format as the Python test case. The main difference between the Java and Python code is how inputs are handled and the replacement of Python's dynamic typing with Java's static typing and explicit casting to handle potential overflow issues when calculating the product of integers.
