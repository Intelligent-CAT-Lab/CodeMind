```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] tokens = input.split(" ");
        int[] s = new int[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            s[i] = Integer.parseInt(tokens[i]);
        }

        Arrays.sort(s);
        System.out.println(s[0] + " " + s[1] + " " + s[2]);
    }
}
```
