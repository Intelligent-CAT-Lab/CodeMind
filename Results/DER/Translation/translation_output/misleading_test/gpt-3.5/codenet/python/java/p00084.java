```java
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        input = input.replace(",", "").replace(".", "");
        String[] words = input.split(" ");
        
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
