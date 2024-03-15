Here's the Python code translated into Java:

```java
import java.util.Scanner;

public class DivisorCounter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int cnt = 0;
        for (int j = 1; j <= n; j++) {
            if (j % 2 == 0) {
                continue;
            }
            if (cnt_divisor(j) == 8) {
                cnt++;
            }
        }
        
        System.out.println(cnt);
        scanner.close();
    }
    
    public static int cnt_divisor(int n) {
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                cnt++;
            }
        }
        return cnt;
    }
}
``` 

Keep in mind that in Java, it's important to use a `Scanner` object to read from the standard input, and we have to close it after we're done with it. Also, Java uses explicit type declarations and semi-colons at the end of statements. The `cnt_divisor` method is translated to be a static method since it's a utility method and doesn't rely on any instance variables. The `main` method is the entry point of the Java application.
