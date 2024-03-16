```java
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] inputArray = scanner.nextLine().split(" ");
        HashSet<Integer> set = new HashSet<>();
        
        for (String numStr : inputArray) {
            set.add(Integer.parseInt(numStr));
        }
        
        System.out.println(set.size());
    }
}
```
