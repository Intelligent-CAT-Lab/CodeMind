```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        String a = input[0];
        String b = new StringBuilder(input[1]).reverse().toString();
        
        int result = Integer.parseInt(a) + Integer.parseInt(b);
        System.out.println(result);
    }
}
```

