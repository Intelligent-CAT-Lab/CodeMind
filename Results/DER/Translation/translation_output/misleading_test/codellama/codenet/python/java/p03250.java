<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 5 2

Expected output:
-2

```
abc = list(map(int, input().split()))
abc.sort()
print(int(str(abc[2]) + str(abc[1])) + abc[0])
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
        abc = sort(abc);
        int result = Integer.parseInt(String.valueOf(abc[2]) + String.valueOf(abc[1])) + abc[0];
        System.out.println(result);
    }

    public static int[] sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `split()` method to split the input into an array of strings. The `map()` method is used to convert each string in the array to an integer. The `sort()` method is then used to sort the array in ascending order. Finally, the `print()` method is used to print the result.

Note that the `sort()` method is a custom method that I have defined in the code. It uses the bubble sort algorithm to sort the array.</s>
