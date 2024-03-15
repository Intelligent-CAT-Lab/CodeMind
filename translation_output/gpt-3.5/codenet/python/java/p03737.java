```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine().toUpperCase();
        String[] words = line.split(" ");
        String s1 = words[0];
        String s2 = words[1];
        String s3 = words[2];
        
        System.out.println("" + s1.charAt(0) + s2.charAt(0) + s3.charAt(0));
    }
}
```
