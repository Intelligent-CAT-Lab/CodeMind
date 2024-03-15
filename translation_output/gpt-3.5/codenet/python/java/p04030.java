```java
import java.util.Scanner;

public class RemoveB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String a = "";
        
        for (char i : s.toCharArray()) {
            if (i == 'B') {
                if (!a.equals("")) {
                    a = a.substring(0, a.length() - 1);
                }
            } else {
                a += i;
            }
        }
        
        System.out.println(a);
    }
}
```
