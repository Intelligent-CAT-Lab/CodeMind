```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int i = 0, c = 0, p = 0;
        char b = ' ';
        
        while (i < s.length()) {
            if (s.charAt(i) == b) {
                if (c > p) {
                    b = s.charAt(i);
                    p = c;
                }
                c = 0;
            }
            b = s.charAt(i);
            i += (s.charAt(i) == 'c') ? 7 : 3;
            c++;
        }
        
        char r = (c > p) ? b : ' ';
        System.out.println((r == 'e') ? "egg" : "chicken");
    }
}
```
