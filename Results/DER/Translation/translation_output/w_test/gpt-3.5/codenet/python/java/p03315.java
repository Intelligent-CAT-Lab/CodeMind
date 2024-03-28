```java
import java.util.Scanner;

public class CountPlusMinus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        int countPlus = 0;
        int countMinus = 0;

        for(char c : input.toCharArray()) {
            if(c == '+') {
                countPlus++;
            } else if(c == '-') {
                countMinus++;
            }
        }

        int result = countPlus - countMinus;
        System.out.println(result);
    }
}
```
