```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();

        if (S.length() < 5) {
            System.out.println("NO");
            System.exit(0);
        } else {
            int i = 0;
            while (true) {
                if ((i + 5 == S.length() && S.substring(i, i + 5).equals("dream")) ||
                        (i + 5 == S.length() && S.substring(i, i + 5).equals("erase")) ||
                        (i + 6 == S.length() && S.substring(i, i + 6).equals("eraser")) ||
                        (i + 7 == S.length() && S.substring(i, i + 7).equals("dreamer"))) {
                    System.out.println("YES");
                    System.exit(0);
                } else if (S.substring(i, i + 5).equals("dream") && i + 8 <= S.length()) {
                    if (S.substring(i + 5, i + 8).equals("erd") || S.substring(i + 5, i + 8).equals("ere"))
                        i += 7;
                    else if (S.substring(i + 5, i + 8).equals("era") || S.substring(i + 5, i + 6).equals("d"))
                        i += 5;
                    else {
                        System.out.println("NO");
                        System.exit(0);
                    }
                } else if (S.substring(i, i + 5).equals("erase") && i + 7 <= S.length()) {
                    if (S.substring(i + 5, i + 6).equals("e") || S.substring(i + 5, i + 6).equals("d"))
                        i += 5;
                    else if (S.substring(i + 5, i + 6).equals("r"))
                        i += 6;
                    else {
                        System.out.println("NO");
                        System.exit(0);
                    }
                } else {
                    System.out.println("NO");
                    System.exit(0);
                }
            }
        }
    }
}
```
```
