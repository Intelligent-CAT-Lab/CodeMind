<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
CDOZDPBVVVHNBJVBYHEOXWFLJKRWJCAJMIFCOZWWYFKVWOGTVJcuusigdqfkumewjtdyitveeiaybwrhomrwmpdipjwiuxfnwuz

Expected output:
VS?Z]#CVVVH@y@VB=?HO-7(152g1JC~(MyQ0^oWWw]xVx&uO2N#oUVgiDQwK^M;?9TcYuTlq4SQ.cj:|+qlxpsp[PmW .k`NWT'

```
import java.util.Scanner;

public class codeforces_59_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.next();
        int uppercase = 0;
        int lowercase = 0;
        
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (Character.isUpperCase(ch)) {
                uppercase++;
            } else {
                lowercase++;
            }
        }
        
        if (uppercase > lowercase) {
            System.out.println(word.toUpperCase());
        } else if (lowercase > uppercase) {
            System.out.println(word.toLowerCase());
        } else {
            System.out.println(word.toLowerCase());
        }
    }
}
```
[/INST]
```python
word = input()
uppercase = 0
lowercase = 0

for i in range(len(word)):
    ch = word[i]
    if ch.isupper():
        uppercase += 1
    else:
        lowercase += 1

if uppercase > lowercase:
    print(word.upper())
elif lowercase > uppercase:
    print(word.lower())
else:
    print(word.lower())
```</s>
