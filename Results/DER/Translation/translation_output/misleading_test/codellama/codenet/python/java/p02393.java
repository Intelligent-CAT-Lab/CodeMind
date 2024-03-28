<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 8 1

Expected output:
1 3 8 90

```
s =list(map(int,input().split()))
s1 = sorted(s)
print(str(s1[0])+" "+str(s1[1])+" "+str(s1[2]))


```
[/INST]
```java
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] numbers = input.split(" ");
        int[] nums = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            nums[i] = Integer.parseInt(numbers[i]);
        }
        int[] sortedNums = sort(nums);
        System.out.println(sortedNums[0] + " " + sortedNums[1] + " " + sortedNums[2]);
    }

    public static int[] sort(int[] nums) {
        int[] sortedNums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            sortedNums[i] = nums[minIndex];
            nums[minIndex] = Integer.MAX_VALUE;
        }
        return sortedNums;
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `split()` method to split the input into an array of strings. The `map()` method is then used to convert each string to an integer, and the resulting array is stored in the `nums` variable.

The `sort()` method is then called to sort the `nums` array in ascending order. The `sortedNums` array is then printed to the console.

Note that this code assumes that the input will always be a valid integer, and will throw a `NumberFormatException` if the input is not a valid integer.</s>
