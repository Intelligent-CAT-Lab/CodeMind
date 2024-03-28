Here is the equivalent Java code for the given Python code:

```java
import java.util.Arrays;
import java.util.Scanner;

public class RectangleSides {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[4];

        for (int i = 0; i < 4; i++) {
            nums[i] = scanner.nextInt();
        }
        scanner.close();

        Arrays.sort(nums);
        if (nums[0] == nums[1] && nums[2] == nums[3]) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
```

In this Java code, we read the input using a `Scanner` object, sort the array using `Arrays.sort()`, and then compare the elements using an `if-else` statement to check if we can form a rectangle with equal sides based on the conditions given in the Python code.
