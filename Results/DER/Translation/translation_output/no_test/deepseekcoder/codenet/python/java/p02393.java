<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
s =list(map(int,input().split()))
s1 = sorted(s)
print(str(s1[0])+" "+str(s1[1])+" "+str(s1[2]))


```

### Response:
```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strNums = scanner.nextLine().split(" ");
        int[] nums = new int[strNums.length];
        for (int i = 0; i < strNums.length; i++) {
            nums[i] = Integer.parseInt(strNums[i]);
        }
        Arrays.sort(nums);
        System.out.println(nums[0] + " " + nums[1] + " " + nums[2]);
    }
}
```

This Java code does the same thing as your Python code. It reads a line of input, splits it into an array of strings, converts each string to an integer, sorts the integers, and then prints the first, second, and third integers (which are the smallest, second smallest, and third smallest, respectively).
<|EOT|>
