<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 4 2 2 1

Expected output:
Yes

```
i = list(map(int, input().split()))

if i[2] + i[4] <= i[0]:
    if i[2] - i[4] >= 0:
        if i[3] + i[4] <= i[1]:
            if i[3] - i[4] >= 0:
                print("Yes")
            else:
                print("No")
        else:
            print("No")
    else:
        print("No")
else:
    print("No")

```
[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = sc.nextLine().split(" ").map(Integer::parseInt).toArray(new int[0]);

        if (input[2] + input[4] <= input[0]) {
            if (input[2] - input[4] >= 0) {
                if (input[3] + input[4] <= input[1]) {
                    if (input[3] - input[4] >= 0) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No");
                    }
                } else {
                    System.out.println("No");
                }
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("No");
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `map` method to convert the input string to an array of integers. It then uses the `toArray` method to convert the `List` object returned by `map` to an array of integers.

The rest of the code is similar to the Python code, with the only difference being that Java uses `System.out.println` to print the output, instead of `print`.</s>
