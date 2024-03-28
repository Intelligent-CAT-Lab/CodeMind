```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        int max = Math.max(Math.max(a, b), c);
        
        System.out.println(a + b + c - max);
    }
}
```  
