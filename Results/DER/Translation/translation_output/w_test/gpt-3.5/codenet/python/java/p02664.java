```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        
        char[] arr = a.toCharArray();
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '?') {
                arr[i] = 'D';
            }
        }
        
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            result.append(arr[i]);
        }
        
        System.out.println(result.toString());
    }
}
```
