```java
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String code = scanner.nextLine();
        code = code.replace(",", "").replace(".", "");
        String[] words = code.split("\\s+");

        ArrayList<String> list = new ArrayList<>();

        for (String word : words) {
            if (word.length() >= 3 && word.length() <= 6) {
                list.add(word);
            }
        }

        for (String word : list) {
            System.out.print(word + " ");
        }
    }
}
```
