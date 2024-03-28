Below is the translated Java code based on the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // reading N from input
        int K = sc.nextInt(); // reading K from input

        if (K > ((N - 1) * (N - 2)) / 2) {
            System.out.println(-1);
            return;
        }

        System.out.println(N - 1 + ((N - 1) * (N - 2)) / 2 - K);

        for (int i = 2; i <= N; i++) {
            System.out.println(1 + " " + i);
        }

        int a = 0;
        for (int i = 2; i < N; i++) {
            for (int j = i + 1; j <= N; j++) {
                if (a < ((N - 1) * (N - 2)) / 2 - K) {
                    System.out.println(i + " " + j);
                    a++;
                }
            }
        }
        sc.close();
    }
}
```

You can compile and run the Java code using a Java Development Kit (JDK) installation and provide the input manually or using a file. When you execute the program, it will wait for you to input the values for `N` and `K`, just like the Python program would read from the standard input. After providing the input values, it will produce the expected output.

Remember to name your Java file as `Main.java` and to have the JDK properly installed to compile and run the code successfully.
