Certainly! Below is the equivalent Java code to perform the same operations as the provided Python code.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        boolean b = S.replace("A", "").equals("KIHBR");
        
        if (b) {
            String modifiedS = S.replaceAll("[^A]", "*");
            String[] splitS = modifiedS.split("\\*");
            int[] L = new int[splitS.length];
            for (int i = 0; i < splitS.length; i++) {
                L[i] = splitS[i].length();
            }
            int[] X = {1, 0, 0, 1, 1, 1, 1};
            for (int i = 0; i < L.length; i++) {
                if (L[i] > X[i]) {
                    b = false;
                    break;
                }
            }
        }

        System.out.println(b ? "YES" : "NO");
        scanner.close();
    }
}
```

To test this code with the provided input case:

Test input:
```
KIHBR
```

Expected output:
```
YES
```

Please note that the Java output is slightly different from the Python "YNEOS" logic. I have instead used "YES" and "NO" to make it more Java-idiomatic. If you specifically want "spC" as the output for "YES" and "" (an empty string) for "NO", please let me know, and I will adjust the code accordingly.
