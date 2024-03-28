```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Permutations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }
        
        permute(numbers, 0, n);
    }
    
    public static void permute(List<Integer> numbers, int start, int end) {
        if (start == end) {
            for (int num : numbers) {
                System.out.print(num + " ");
            }
            System.out.println();
        } else {
            for (int i = start; i < end; i++) {
                swap(numbers, start, i);
                permute(numbers, start + 1, end);
                swap(numbers, start, i);
            }
        }
    }
    
    public static void swap(List<Integer> numbers, int i, int j) {
        int temp = numbers.get(i);
        numbers.set(i, numbers.get(j));
        numbers.set(j, temp);
    }
}
```
