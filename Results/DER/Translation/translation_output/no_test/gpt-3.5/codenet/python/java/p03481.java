```java
import java.util.Scanner;

public class BitLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] input = scanner.nextLine().split(" ");
        int X = Integer.parseInt(input[0]);
        int Y = Integer.parseInt(input[1]);

        int k = Integer.toBinaryString(Y / X).length();
        System.out.println(k);
        
        scanner.close();
    }
}
```
