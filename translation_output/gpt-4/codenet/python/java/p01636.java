Below is the Java equivalent of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int ans = 0;
        
        for (int i = 1; i < a.length(); i++) {
            String df = a.substring(0, i);
            String sm = a.substring(i);
            
            if (sm.startsWith("0")) {
                continue;
            }
            
            int dfInt = Integer.parseInt(df);
            int smInt = Integer.parseInt(sm);
            
            if ((dfInt + smInt) % 2 == 0 && smInt >= dfInt && (smInt - dfInt) % 2 == 0) {
                ans += 1;
            }
        }
        
        if (Integer.parseInt(a) % 2 == 0) {
            ans += 1;
        }
        
        System.out.println(ans);
    }
}
```

Make sure to include the necessary imports for Scanner and wrap this solution into a class if you haven't defined one already. Also, note that user input handling in Java requires exception handling, which is not provided here for brevity.
