```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = Arrays.stream(new java.util.Scanner(System.in).nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
        
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
```
