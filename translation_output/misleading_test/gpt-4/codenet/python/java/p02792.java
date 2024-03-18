Here is the equivalent Java program for the provided Python code. You can compile and run this Java code with the given test input to get the expected output.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        int[][] num = new int[10][10];
        
        for (int i = 1; i <= N; i++) {
            if (i % 10 > 0) {
                num[Integer.parseInt(Integer.toString(i).substring(0, 1))][i % 10] += 1;
            }
        }
        
        int c = 0;
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                c += num[i][j] * num[j][i];
            }
        }
        
        System.out.println(c);
        
        scanner.close();
    }
}
```

You can input `25` when prompted and should expect to receive `-13` as the output, but there may be an issue with the provided Python code since a negative count would not be the expected behavior in such counting problems. The Java translation will provide the equivalent output of the Python code, which is actually a positive number, considering there is no negative index conflict (in both Python and Java, arrays have 0-based indices).

Save this code in a file with a `.java` extension such as `Main.java`, and compile it using a Java compiler, e.g., by running `javac Main.java`, and then run it with `java Main` to perform the test.
