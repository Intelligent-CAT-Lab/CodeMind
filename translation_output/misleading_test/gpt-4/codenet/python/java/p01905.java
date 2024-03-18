Here is the translated Java code from the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] a = new int[M];
        for (int i = 0; i < M; i++) {
            a[i] = scanner.nextInt();  // Assuming the additional inputs are provided for array 'a'
        }
        
        int num = N - M;
        int ans = 0;
        while (num > 0) {
            ans += 1;
            num -= 1;
        }
        
        System.out.println(ans - 1);
        scanner.close();
    }
}
```

To execute the Java program with a test input, you will need to run the program and provide the inputs accordingly. Unlike the Python code, you will have to input the elements for the array `a` after entering `N` and `M` as these inputs would be expected by the program.

For the given test case, you would enter the input as follows:

```
2 0
```

You'll notice that we're not actually using the input array `a` with this particular example, but the Java code is set up to read values into an array `a` just as the Python code would. The expected output, as per the Python program, will be `-27`.
