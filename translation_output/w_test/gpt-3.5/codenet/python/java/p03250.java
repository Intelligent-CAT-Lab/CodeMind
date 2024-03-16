```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] abcStr = scanner.nextLine().split(" ");
        int[] abc = new int[3];
        for (int i = 0; i < abcStr.length; i++) {
            abc[i] = Integer.parseInt(abcStr[i]);
        }
        Arrays.sort(abc);
        System.out.println(Integer.parseInt(String.valueOf(abc[2]) + String.valueOf(abc[1])) + abc[0]);
    }
}
```
