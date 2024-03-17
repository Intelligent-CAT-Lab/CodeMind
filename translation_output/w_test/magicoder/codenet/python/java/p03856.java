<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        String[] a = {"dream", "dreamer", "erase", "eraser", "dreamerase", "dreameraser"};
        int[] numlist = {0, 0, 0, 0, 0, 0};

        for (int i = 0; i < a.length; i++) {
            numlist[i] = countOccurrences(S, a[i]);
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

    public static int countOccurrences(String str, String word) {
        int lastIndex = 0;
        int count = 0;
        while (lastIndex != -1) {
            lastIndex = str.indexOf(word, lastIndex);
            if (lastIndex != -1) {
                count++;
                lastIndex += word.length();
            }
        }
        return count;
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the user, counts the occurrences of certain words in the string, and then checks if the total number of occurrences of the words multiplied by their respective weights equals the length of the string. If it does, it prints "YES", otherwise it prints "NO".<｜end▁of▁sentence｜>
