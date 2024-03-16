```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        char[] odd = {'R', 'U', 'D'};
        char[] even = {'L', 'U', 'D'};
        
        for (int i = 0; i < s.length(); i += 2) {
            if (!checkValid(s.charAt(i), odd)) {
                System.out.println("No");
                return;
            }
        }
        
        for (int j = 1; j < s.length(); j += 2) {
            if (!checkValid(s.charAt(j), even)) {
                System.out.println("No");
                return;
            }
        }
        
        System.out.println("Yes");
    }
    
    public static boolean checkValid(char c, char[] arr) {
        for (char ch : arr) {
            if (c == ch) {
                return true;
            }
        }
        return false;
    }
}
```
