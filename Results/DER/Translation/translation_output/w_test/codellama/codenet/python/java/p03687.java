<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
serval

Expected output:
3


```
from collections import Counter

S = list(input())
C = Counter(S)

o = []

for a in C.keys():
    j = 0
    m = 0
    for b in S:
        if a == b:
            j = 0
        else:
            j += 1
            m = max(m,j)
    o.append(m)

print(min(o))
```
[/INST]
```
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] arr = input.toCharArray();
        ArrayList<Character> list = new ArrayList<>();
        for (char c : arr) {
            list.add(c);
        }
        Collections.sort(list);
        int count = 1;
        int maxCount = 1;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) == list.get(i - 1)) {
                count++;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 1;
            }
        }
        System.out.println(maxCount);
    }
}
```
This code uses the `Scanner` class to read the input from the user, and then it converts the input string to a character array using the `toCharArray()` method. It then creates an `ArrayList` of characters and adds each character from the array to the list.

Next, it sorts the list of characters using the `Collections.sort()` method, which sorts the list in ascending order.

The code then iterates through the list of characters and checks if each character is the same as the previous character. If it is the same, it increments a counter variable `count`. If it is not the same, it checks if the current value of `count` is greater than the current value of `maxCount`, and if it is, it updates `maxCount` with the current value of `count`.

Finally, the code prints the value of `maxCount` to the console.

Note that this code assumes that the input string only contains lowercase letters. If the input string can contain uppercase letters as well, you will need to modify the code accordingly.</s>
