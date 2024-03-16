```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputs = input.split(" ");
        int[] abc = new int[3];
        
        for (int i = 0; i < 3; i++) {
            abc[i] = Integer.parseInt(inputs[i]);
        }
        
        Arrays.sort(abc);
        System.out.println(abc[0] + abc[1]);
    }
}
```
