```java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Map<Integer, Integer> dic = new HashMap<>();
        for (int i = 1; i <= 50000; i++) {
            int p = (int) (i * 1.08);
            dic.put(p, i);
        }

        if (dic.containsKey(n)) {
            System.out.println(dic.get(n));
        } else {
            System.out.println(":(");
        }
    }
}
```  
