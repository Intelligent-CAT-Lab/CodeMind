Below is the equivalent Java code for the given Python code, wrapped as you requested:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String moji = scanner.nextLine();
        StringBuilder ans = new StringBuilder();
        
        for (int i = 0; i < moji.length(); i++) {
            ans.append(moji.charAt(i) == '1' ? '9' : '1');
        }
        
        System.out.println(ans.toString());
    }
}
```

To use the provided test case with input `119`, you would run the program and input `119` when prompted, and the program will output `999`.
