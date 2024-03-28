<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 1 3 4

Expected output:
n

```
num = list(map(int,input().split()))
num.sort()
if num[0] == num[1] and num[2] ==num[3]:
    print("yes")
else :
    print("no")

```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] nums = input.split(" ");
        int[] num = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            num[i] = Integer.parseInt(nums[i]);
        }
        Arrays.sort(num);
        if (num[0] == num[1] && num[2] == num[3]) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
```
This code first takes input from the user and splits it into an array of strings using the `split()` method. Then, it converts each string to an integer using the `parseInt()` method and stores it in an integer array. Next, it sorts the array using the `sort()` method. Finally, it checks if the first two elements of the array are equal to each other and the third and fourth elements are also equal to each other, and if so, it prints "yes" to the console, otherwise it prints "no".</s>
