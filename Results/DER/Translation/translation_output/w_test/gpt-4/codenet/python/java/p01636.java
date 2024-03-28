Here is the equivalent Java code for the given Python script:

```java
import java.util.Scanner;

public class EvenSplit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        int ans = 0;
        for (int i = 1; i < a.length(); i++) {
            String dfStr = a.substring(0, i);
            String smStr = a.substring(i);
            if (smStr.charAt(0) == '0') continue;
            int df = Integer.parseInt(dfStr);
            int sm = Integer.parseInt(smStr);
            if ((df + sm) % 2 == 0 && sm >= df && (sm - df) % 2 == 0) {
                ans++;
            }
        }
        
        if (Integer.parseInt(a) % 2 == 0) ans++;
        System.out.println(ans);
        
        scanner.close();
    }
}
```

To test this with the provided test case, you would run the program and enter 19 when prompted for the input. The expected output for this test case would be 1 as per the original Python script.
