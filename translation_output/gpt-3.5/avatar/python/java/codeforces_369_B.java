```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        
        List<Integer> arr = new ArrayList<>();
        for (String str : input) {
            arr.add(Integer.parseInt(str));
        }
        
        int rem = 0;
        int ones = 0;
        List<Integer> string = new ArrayList<>();
        
        ones = arr.get(arr.size() - 1) % arr.get(1);
        for (int i = 0; i < arr.get(1); i++) {
            string.add((int)(Math.floor(arr.get(arr.size() - 1) / arr.get(1)) + (ones > 0)));
            ones--;
        }
        
        if (arr.get(0) != arr.get(1)) {
            rem = arr.get(arr.size() - 2) - arr.get(arr.size() - 1);
            ones = rem % (arr.get(0) - arr.get(1));
            for (int i = arr.get(1); i < arr.get(0); i++) {
                string.add((int)(Math.floor(rem / (arr.get(0) - arr.get(1)) + (ones > 0)));
                ones--;
            }
        }
        
        for (int i : string) {
            System.out.print(i + "▁");
        }
    }
}
```

