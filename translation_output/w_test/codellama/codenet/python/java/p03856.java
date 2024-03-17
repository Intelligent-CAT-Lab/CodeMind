<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
erasedream

Expected output:
YES


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
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String[] a = {"dream", "dreamer", "erase", "eraser", "dreamerase", "dreameraser"};
        int[] numlist = new int[6];
        for (int i = 0; i < a.length; i++) {
            numlist[i] = S.length() - S.replace(a[i], "").length();
        }
        numlist[0] -= numlist[1];
        numlist[2] -= numlist[3];
        numlist[4] -= numlist[5];
        numlist[1] -= (numlist[4] + numlist[5]);
        numlist[0] += (numlist[4] + numlist[5]);
        int total = numlist[0] * 5 + numlist[1] * 7 + numlist[2] * 5 + numlist[3] * 6;
        if (total == S.length()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```
This is the Java code that translates the Python code you provided. It uses the `Scanner` class to read input from the user, and the `String` class to manipulate the input string. The code first defines an array of strings `a` that contains the words "dream", "dreamer", "erase", "eraser", "dreamerase", and "dreameraser". It then defines an array of integers `numlist` that will be used to store the number of occurrences of each word in the input string.

The code then loops through each word in the `a` array and uses the `String.length()` method to get the length of the input string, and the `String.replace()` method to replace all occurrences of the current word with an empty string. The length of the resulting string is then subtracted from the original length to get the number of occurrences of the current word. This process is repeated for each word in the `a` array, and the results are stored in the `numlist` array.

The code then performs some calculations to adjust the values in the `numlist` array, and finally calculates the total number of occurrences of all the words in the input string. If this total is equal to the length of the input string, the code prints "YES", otherwise it prints "NO".</s>
