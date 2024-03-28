Here's the translated Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();
        
        int w = 0;
        for (int i = 0; i < 100000; i++) {
            if (i * (i + 1) / 2 < N && N <= (i + 1) * (i + 2) / 2) {
                w = i + 1;
                break;
            }
        }
        for (int i = w; i > 0; i--) {
            if (N >= i) {
                System.out.println(i);
                N -= i;
            }
        }
    }
}
```

For the test case where the input is `4`, the expected output would be:

```
1
3
```

Please note that the expected output you provided in the question seems to be inaccurate when considering the logic given in the Python code. The correct expected output based on the logic of the code provided does not include the number `27`. 

The above Java code will produce the correct output according to the provided Python logic. To compile and run the Java code, you would save it to a file called `Main.java`, and then compile and run it using a Java compiler and runtime environment.
