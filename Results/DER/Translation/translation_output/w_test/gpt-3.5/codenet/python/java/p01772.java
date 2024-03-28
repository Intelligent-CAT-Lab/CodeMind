```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String ans = "";
        boolean flag = false;
        
        for (char c : s.toCharArray()) {
            if (c == 'A' && !flag) {
                flag = true;
            }
            if (c == 'Z' && flag) {
                ans += "AZ";
                flag = false;
            }
        }
        
        if (ans.equals("")) {
            System.out.println(-1);
        } else {
            System.out.println(ans);
        }
    }
}
```
