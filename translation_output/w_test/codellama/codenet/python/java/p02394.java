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
        String[] input = sc.nextLine().split(" ");
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        if (arr[2] + arr[4] <= arr[0]) {
            if (arr[2] - arr[4] >= 0) {
                if (arr[3] + arr[4] <= arr[1]) {
                    if (arr[3] - arr[4] >= 0) {
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
This code first takes input from the user and splits it into an array of integers using the `split()` method. It then checks the conditions specified in the problem and prints "Yes" or "No" accordingly.

Note that the `Scanner` class is used to read input from the user, and the `parseInt()` method is used to convert the input strings to integers.</s>
