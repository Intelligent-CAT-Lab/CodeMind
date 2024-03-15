<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
for a in reversed(sorted(map(int,raw_input().split()))):print a,
```
[/INST]
```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        int[] nums = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            nums[i] = Integer.parseInt(numbers[i]);
        }
        Arrays.sort(nums);
        for (int num : reversed(nums)) {
            System.out.print(num + " ");
        }
    }
}
```</s>
