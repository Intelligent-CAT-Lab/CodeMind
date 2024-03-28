Below is the equivalent Java code for the Python script you provided. In Java, we need to use a `Scanner` to read the input and use proper variable types and declarations, as well as the ternary operator for the conditional assignment. 

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        int ans = (n * a > b) ? b : n * a;
        
        System.out.println(ans);
        
        scanner.close();
    }
}
```

To compile and execute this Java program:

1. Save the code in a file named `Main.java`.
2. Compile the program using `javac Main.java`.
3. Run the compiled program with `java Main`.
4. Provide the input `4 2 9` when prompted.
5. The program should output `8`.
