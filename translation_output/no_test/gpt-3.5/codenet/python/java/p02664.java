```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();

        char[] charArray = a.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '?') {
                charArray[i] = 'D';
            }
        }

        String b = new String(charArray);

        System.out.println(b);
    }
}
```
