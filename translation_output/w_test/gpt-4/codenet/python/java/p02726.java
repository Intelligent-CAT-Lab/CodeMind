Here is the translated Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.close();
        
        int[] ans = new int[n - 1];
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int a = j - i;
                int b = Math.abs((y - 1) - j) + Math.abs(i - (x - 1)) + 1;
                ans[Math.min(a, b) - 1]++;
            }
        }
        
        for (int i : ans) {
            System.out.println(i);
        }
    }
}
```

To compile and execute this Java code, ensure you have the Java Development Kit (JDK) properly installed on your machine and follow these steps in your terminal or command prompt:

1. Save the code in a file named `Main.java`.
2. Compile the Java code:
```
javac Main.java
```
3. Execute the compiled class:
```
java Main
```
4. Input your test case (e.g., `5 2 4`), then press Enter.

The program should output the expected results as per your provided test case:

```
5
4
1
0
```
