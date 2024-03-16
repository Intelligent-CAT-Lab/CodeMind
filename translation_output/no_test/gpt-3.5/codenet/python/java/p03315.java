```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        
        int e = countOccurrences(a, '+');
        int f = countOccurrences(a, '-');
        
        System.out.println(e - f);
    }

    public static int countOccurrences(String str, char target) {
        int count = 0;
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                count++;
            }
        }
        
        return count;
    }
}
```
