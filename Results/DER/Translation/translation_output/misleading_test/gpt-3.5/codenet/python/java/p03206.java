```java
import java.util.HashMap;

public class ChristmasWords {
    public static void main(String[] args) {
        HashMap<Integer, String> d = new HashMap<>();
        d.put(25, "Christmas");
        d.put(24, "Christmas Eve");
        d.put(23, "Christmas Eve Eve");
        d.put(22, "Christmas Eve Eve Eve");

        int D = 25;
        System.out.println(d.get(D));
    }
}
```
