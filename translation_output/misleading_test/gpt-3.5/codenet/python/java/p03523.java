```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();

        boolean b = S.replace("A", "").equals("KIHBR");
        if (b) {
            String[] parts = (S + " ").split("A");
            List<Integer> L = new ArrayList<>();
            for (String part : parts) {
                L.add(part.length());
            }

            int[] X = {1, 0, 0, 1, 1, 1, 1};
            for (int i = 0; i < L.size(); i++) {
                b &= L.get(i) <= X[i];
            }
        }

        System.out.println(b ? "sp" : "C");
    }
}
```  
