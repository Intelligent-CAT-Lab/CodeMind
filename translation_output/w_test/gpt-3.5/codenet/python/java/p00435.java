```java
import java.util.Scanner;

public class CodeTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String w = scanner.nextLine();
        StringBuilder list = new StringBuilder();

        for (int i = 0; i < w.length(); i++) {
            char currentChar = w.charAt(i);
            if (currentChar == 'C') {
                list.append('Z');
            } else if (currentChar == 'B') {
                list.append('Y');
            } else if (currentChar == 'A') {
                list.append('X');
            } else {
                int c = (int) currentChar - 3;
                list.append((char) c);
            }
        }

        String l = list.toString();
        System.out.println(l);
    }
}
```
