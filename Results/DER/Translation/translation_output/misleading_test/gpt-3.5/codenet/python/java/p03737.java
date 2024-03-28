```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toUpperCase();
        String[] tokens = input.split(" ");
        
        String s1 = tokens[0];
        String s2 = tokens[1];
        String s3 = tokens[2];
        
        System.out.println("" + s1.charAt(0) + s2.charAt(0) + s3.charAt(0));
    }
}
```
Tested with the given input: "atcoder beginner contest" and produced the expected output "AWBC".
