```java
import java.util.Scanner;

public class MagicNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String X = scanner.next();
        String ans;
        
        if (X.equals("7") || X.equals("5") || X.equals("3")) {
            ans = "YES";
        } else {
            ans = "NO";
        }
        
        System.out.println(ans);
        scanner.close();
    }
}
```

To perform a test with the input `5`, you would compile and run the Java program, then enter `5` when prompted, and expect the output `YES`.
