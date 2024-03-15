```java
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputValues = scanner.nextLine().split(" ");
        
        Set<Integer> numbersSet = new HashSet<>();
        for (String value : inputValues) {
            numbersSet.add(Integer.parseInt(value));
        }
        
        System.out.println(numbersSet.size());
    }
}
```
