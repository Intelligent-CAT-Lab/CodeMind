```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        List<StringBuilder> grid = new ArrayList<>();
        
        for (int i = 0; i < 100; i++) {
            char defC = i < 50 ? '.' : '#';
            StringBuilder line = new StringBuilder();
            for (int j = 0; j < 100; j++) {
                line.append(defC);
            }
            grid.add(line);
        }
        
        int h = (B - 1) / 50;
        int w = (B - 1) % 50;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < 50; j++) {
                grid.get(i * 2).setCharAt(j * 2, '#');
            }
        }
        for (int i = 0; i < w; i++) {
            grid.get(h * 2).setCharAt(i * 2, '#');
        }
        
        h = (A - 1) / 50;
        w = (A - 1) % 50;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < 50; j++) {
                grid.get(i * 2 + 51).setCharAt(j * 2, '.');
            }
        }
        for (int i = 0; i < w; i++) {
            grid.get(h * 2 + 51).setCharAt(i * 2, '.');
        }
        
        System.out.println(100 + " " + 100);
        for (StringBuilder line : grid) {
            System.out.println(line);
        }
    }
}
```
