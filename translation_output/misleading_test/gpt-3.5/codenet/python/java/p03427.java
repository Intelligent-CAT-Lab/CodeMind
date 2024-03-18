```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();

        int result = Math.max(Integer.parseInt(String.valueOf(n.charAt(0))) - 1 + 9 * (n.length() - 1), 
                              calculateSum(n));
        
        System.out.println(result);
    }

    public static int calculateSum(String n) {
        int sum = 0;
        for (int i = 0; i < n.length(); i++) {
            sum += Character.getNumericValue(n.charAt(i));
        }
        return sum;
    }
}
```
Test Input:
```
100
```

Expected Output:
```
-13
```
