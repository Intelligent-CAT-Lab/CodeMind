```java
import java.util.*;

public class PathString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] nums = input.split(" ");
        int[] numbers = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numbers[i] = Integer.parseInt(nums[i]);
        }
        int start = 0;
        List<String> arr = new ArrayList<>();
        int count = 0;
        
        for (int i = 0; i < numbers[0]; i++) {
            String string = " ";
            int next = start;
            
            for (int j = 0; j < numbers[0]; j++) {
                if (count < numbers[1]) {
                    if (j == next) {
                        string += " L ";
                        count++;
                        next += 2;
                        if (next >= numbers[0]) {
                            start = (start == 0) ? 1 : 0;
                        }
                    } else {
                        string += " S ";
                    }
                } else {
                    string += " S ";
                }
            }
            arr.add(string);
        }
        
        if (count < numbers[1]) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            for (String path : arr) {
                System.out.println(path);
            }
        }
    }
}
```

