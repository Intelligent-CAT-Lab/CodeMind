```java
import java.util.Scanner;

public class DecodeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();
            for (int i = 0; i <= ('z' - 'a'); i++) {
                if (line.contains("the") || line.contains("that") || line.contains("this")) {
                    System.out.println(line);
                    break;
                }
                line = decode(line);
            }
        }
        scanner.close();
    }

    public static String decode(String s) {
        String result = "";
        for (char c : s.toCharArray()) {
            if (c != ' ' && c != '.') {
                result += (char) (c + 1);
            } else {
                result += c;
            }
        }
        return result.replace((char) ('z' + 1), 'a');
    }
}
```
