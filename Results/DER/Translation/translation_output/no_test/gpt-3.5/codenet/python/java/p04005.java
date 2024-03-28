```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        List<Integer> list = new ArrayList<>();
        
        for (String s : input) {
            list.add(Integer.parseInt(s));
        }

        Collections.sort(list);

        int ans = 0;
        for (int i = 0; i < 3; i++) {
            if (list.get(i) % 2 == 0) {
                ans = 0;
                break;
            } else {
                ans = list.get(0) * list.get(1);
            }
        }

        System.out.println(ans);
    }
}
```
