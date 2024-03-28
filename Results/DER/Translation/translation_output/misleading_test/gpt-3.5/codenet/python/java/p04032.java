```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();

        if (S.length() == 2) {
            if (S.charAt(0) == S.charAt(1)) {
                System.out.println(1 + " " + 2);
            } else {
                System.out.println(-1 + " " + -1);
            }
            return;
        }

        for (int i = 0; i < S.length() - 2; i++) {
            String subString = S.substring(i, i + 3);
            char[] s = subString.toCharArray();
            int distinctCount = (int) subString.chars().distinct().count();
            if (distinctCount <= 2) {
                System.out.println((i + 1) + " " + (i + 3));
                return;
            }
        }

        System.out.println(-1 + " " + -1);
    }
}
```  
