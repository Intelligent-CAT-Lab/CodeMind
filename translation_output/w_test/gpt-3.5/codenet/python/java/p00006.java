```java
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        StringBuilder reversed = new StringBuilder(input).reverse();
        
        System.out.println(reversed.toString());
    }
}
```
