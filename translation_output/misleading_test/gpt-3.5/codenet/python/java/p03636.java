```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        char a = input.charAt(0);
        int len = input.length() - 2;
        char c = input.charAt(input.length() - 1);
        
        System.out.println(a + len + c);
    }
}
```  
