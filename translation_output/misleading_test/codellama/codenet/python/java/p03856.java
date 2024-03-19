<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
erasedream

Expected output:
Y#ES

```
S=input()
a=["dream","dreamer","erase","eraser","dreamerase","dreameraser"]

numlist=[0,0,0,0,0,0]
for i in range(len(a)):
    numlist[i]=S.count(a[i])
numlist[0]-=numlist[1]
numlist[2]-=numlist[3]
numlist[4]-=numlist[5]
numlist[1]-=(numlist[4]+numlist[5])   #èª¤ã£ã¦dreamerã§æ°ããåã
numlist[0]+=(numlist[4]+numlist[5])   #dreamã«è¨ä¸ããªãã
total=numlist[0]*5+numlist[1]*7+numlist[2]*5+numlist[3]*6
if total==len(S):
    print("YES")
else:
    print("NO")

```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] words = {"dream", "dreamer", "erase", "eraser", "dreamerase", "dreameraser"};
        int[] numList = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            numList[i] = input.length() - input.replace(words[i], "").length();
        }
        numList[0] -= numList[1];
        numList[2] -= numList[3];
        numList[4] -= numList[5];
        numList[1] -= (numList[4] + numList[5]);
        numList[0] += (numList[4] + numList[5]);
        int total = numList[0] * 5 + numList[1] * 7 + numList[2] * 5 + numList[3] * 6;
        if (total == input.length()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```
Explanation:

* The code first prompts the user to enter a string using the `Scanner` class.
* It then defines an array of strings `words` that contains the words "dream", "dreamer", "erase", "eraser", "dreamerase", and "dreameraser".
* It initializes an array of integers `numList` with the length of `words`.
* It then loops through each word in `words` and uses the `String.length()` method to get the length of the input string, and the `String.replace()` method to replace all occurrences of the current word with an empty string. The length of the resulting string is then subtracted from the length of the input string to get the number of occurrences of the current word.
* It then subtracts the number of occurrences of "dreamer" from the number of occurrences of "dream", and the number of occurrences of "eraser" from the number of occurrences of "erase".
* It then subtracts the number of occurrences of "dreamerase" from the number of occurrences of "dreamer" and "dreameraser" from the number of occurrences of "dreamer" and "eraser".
* It then adds the number of occurrences of "dreamerase" and "dreameraser" to the number of occurrences of "dream".
* It then calculates the total number of occurrences of all the words by multiplying the number of occurrences of each word by a weight factor (5, 7, 5, 6 for "dream", "dreamer", "erase", and "eraser" respectively).
* It then checks if the total number of occurrences is equal to the length of the input string, and prints "YES" if it is, and "NO" otherwise.

Note: The code assumes that the input string only contains the words "dream", "dreamer", "erase", "eraser", "dreamerase", and "dreameraser". If the input string contains other words, the code will not work correctly.</s>
