```java
import java.util.Scanner;

public class NumberPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int i = 1, j = n * n;
        while (i < j) {
            System.out.println(i + " " + j);
            i++;
            j--;
        }
    }
}
```
