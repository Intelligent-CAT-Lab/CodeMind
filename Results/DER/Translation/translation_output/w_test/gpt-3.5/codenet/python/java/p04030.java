```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String a = "";
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'B') {
                if (!a.equals("")) {
                    a = a.substring(0, a.length()-1);
                }
            } else {
                a += c;
            }
        }
        
        System.out.println(a);
    }
}
```
