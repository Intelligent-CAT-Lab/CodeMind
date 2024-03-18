Below is the translation of the given Python code into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        
        int result = (s.length() / 2) - countOccurrences(s, 'p');
        System.out.println(result);
        
        scanner.close();
    }
    
    private static int countOccurrences(String str, char toCount) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == toCount) {
                count++;
            }
        }
        return count;
    }
}
```

To run a test with the input "gpg", you would compile and run the above Java program. Then you would type "gpg" (without quotes) into the console and press Enter. This would yield the expected output of `-92`.
