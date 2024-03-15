```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String Alfa = "abcdefghijklmnopqrstuvwxyz";
        Scanner scanner = new Scanner(System.in);
        String w = scanner.nextLine();

        for (int i = 0; i < Alfa.length(); i++) {
            if (countCharacter(w, Alfa.charAt(i)) % 2 == 1) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }

    public static int countCharacter(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }
}
```
