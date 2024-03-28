```java
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String code = scanner.nextLine();

        code = code.replace(",", "");
        code = code.replace(".", "");
        String[] codeArray = code.split(" ");

        ArrayList<String> list = new ArrayList<>();
        
        for (String var : codeArray) {
            if (var.length() >= 3 && var.length() <= 6) {
                list.add(var);
            }
        }

        for (String var : list) {
            System.out.print(var + " ");
        }
    }
}
```
