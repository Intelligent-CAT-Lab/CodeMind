```java
import java.util.Scanner;

public class TranslateCode {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        String result = " ";
        int i = 0;
        
        while (i < s.length()) {
            if (s.charAt(i) == '.') {
                result += '0';
            } else {
                i += 1;
                if (s.charAt(i) == '.') {
                    result += '1';
                } else {
                    result += '2';
                }
            }
            i += 1;
        }
        
        System.out.println(result.trim());
    }
}
```

