Below is the equivalent Java code for the provided Python script:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int ans = 0;
        int tmp = 1;
        
        while (n > tmp) {
            tmp *= 3;
            ans++;
        }
        
        System.out.println(ans);
        
        scanner.close();
    }
}
```

This Java program performs the same operations as the given Python code. It reads an integer from the user input, initializes two variables `ans` and `tmp`, and then uses a while loop to determine the smallest power of 3 that is greater than or equal to `n`. Finally, it prints the calculated power.
