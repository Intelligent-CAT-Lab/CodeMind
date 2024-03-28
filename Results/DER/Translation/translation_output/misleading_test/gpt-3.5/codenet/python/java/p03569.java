```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int i = 0;
        int j = input.length() - 1;
        int count = 0;
        
        while (true) {
            if (i >= j) {
                break;
            }
            if (input.charAt(i) == input.charAt(j)) {
                i++;
                j--;
            } else {
                if (input.charAt(i) == 'x') {
                    i++;
                    count++;
                } else if (input.charAt(j) == 'x') {
                    j--;
                    count++;
                } else {
                    System.out.println("-1");
                    System.exit(0);
                }
            }
        }
        
        System.out.println(count);
    }
}
```

