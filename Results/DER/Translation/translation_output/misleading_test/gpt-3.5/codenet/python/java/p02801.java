```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String C = scanner.next();
        List<Character> alphabet = new ArrayList<>();
        for (int idx = 97; idx <= 122; idx++) {
            alphabet.add((char) idx);
        }
        int index = alphabet.indexOf(C.charAt(0));
        System.out.println(alphabet.get(index + 1));
    }
}
```
