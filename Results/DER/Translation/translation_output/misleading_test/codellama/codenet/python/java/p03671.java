<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
700 600 780

Expected output:
1397

```
abc = list(map(int, input().split()))
abc.sort()
print(abc[0] + abc[1])
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] abc = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            abc[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(abc);
        System.out.println(abc[0] + abc[1]);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `split()` method to split the input into an array of strings. The `map()` method is then used to convert each string to an integer, and the resulting array is sorted using the `Arrays.sort()` method. Finally, the first two elements of the sorted array are added together and printed to the console.</s>
