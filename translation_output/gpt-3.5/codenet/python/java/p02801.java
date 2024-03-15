```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char C = scanner.next().charAt(0);
        
        List<Character> al = new ArrayList<>();
        for (int idx = 97; idx < 123; idx++) {
            al.add((char) idx);
        }
        
        int index = al.indexOf(C);
        System.out.println(al.get(index + 1));
    }
}
```
