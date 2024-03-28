Here's the translated Java code equivalent to the provided Python snippet:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] s = scanner.next().toCharArray();
        Arrays.sort(s);
        
        if(s[0] == s[1] && s[2] == s[3] && s[0] != s[2]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        scanner.close();
    }
}

// Test input: STOP
// Expected output: No
```

Please note, since the logic depends on the length of the input being exactly 4, this Java code assumes the same constraint. Otherwise, some additional checks would be necessary to prevent potential `ArrayIndexOutOfBoundsException` if the length of the input is different from 4.
