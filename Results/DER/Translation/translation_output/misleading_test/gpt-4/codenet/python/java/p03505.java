Here's the translated Java code for the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int K = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        
        if (A <= B && K > A) {
            System.out.println(-1);
        } else if (A >= K) {
            System.out.println(1);
        } else {
            int jumps = 1 - (int)Math.ceil((double)(K - A) / (A - B)) * 2;
            System.out.println(jumps);
        }

        scanner.close();
    }
    
    public static void main(String args[]) {
        Main main = new Main();
        main.main();
    }
}
```

And here's a test case based on the inputs provided:

Input:
```
4000 2000 500
```

Expected output:
```
-6
```

The Java code takes input from the console, similar to how the Python code gets input from the standard input (`input().split()`). The rest of the code performs the same logical operations and prints out the result to the console as the Python code does.
