<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
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
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String[] a = {"dream", "dreamer", "erase", "eraser", "dreamerase", "dreameraser"};
        int[] numlist = new int[6];
        for (int i = 0; i < a.length; i++) {
            numlist[i] = S.split(" ").length - S.split(a[i]).length;
        }
        numlist[0] -= numlist[1];
        numlist[2] -= numlist[3];
        numlist[4] -= numlist[5];
        numlist[1] -= (numlist[4] + numlist[5]);
        numlist[0] += numlist[4] + numlist[5];
        int total = numlist[0] * 5 + numlist[1] * 7 + numlist[2] * 5 + numlist[3] * 6;
        if (total == S.split(" ").length) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```</s>
