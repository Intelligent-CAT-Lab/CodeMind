```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int h = input.nextInt();
        int w = input.nextInt();
        int a = input.nextInt();
        int b = input.nextInt();
        
        for (int i = 0; i < h; i++) {
            if (i < b) {
                System.out.println(createRow(a, w, '0', '1'));
            } else {
                System.out.println(createRow(a, w, '1', '0'));
            }
        }
    }
    
    public static String createRow(int a, int w, char charA, char charB) {
        StringBuilder row = new StringBuilder();
        for (int j = 0; j < a; j++) {
            row.append(charA);
        }
        for (int j = a; j < w; j++) {
            row.append(charB);
        }
        return row.toString();
    }
}
```
