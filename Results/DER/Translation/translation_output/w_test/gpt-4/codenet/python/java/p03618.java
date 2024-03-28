Here is the equivalent Java code for the provided Python script. It reads a string, calculates a specific value based on permutations and groupings, and prints out the result. Java does not have a built-in GCD or permutations function, nor does it have a groupby function. Nonetheless, I have implemented the necessary logic to achieve the same result as in the Python code.

```java
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String originalInput = scanner.nextLine();
        char[] s = originalInput.toCharArray();
        Arrays.sort(s);
        Map<Character,Integer> freqMap = new HashMap<>();

        for (char c : s) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        int l = s.length;
        long res = ((long) l * (l - 1) / 2) + 1;
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            int p = entry.getValue();
            res -= ((long) p * (p - 1) / 2);
        }
        System.out.println(res);
    }
}
```

Note: The `Scanner` class is used for reading input in Java, which is equivalent to the `input` function in Python. The `HashMap` is employed here instead of the `groupby` and `Counter` classes from Python. In Java, since integer division can lead to integer overflow on multiplication, I'm explicitly casting the operands to `long` where necessary to prevent overflow (Python handles large integers automatically).
