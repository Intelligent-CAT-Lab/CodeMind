<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
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

### Response:
```python
def codeforces_59_A(word):
    uppercase = 0
    lowercase = 0

    for ch in word:
        if ch.isupper():
            uppercase += 1
        else:
            lowercase += 1

    if uppercase > lowercase:
        return word.upper()
    elif lowercase > uppercase:
        return word.lower()
    else:
        return word.lower()

# Test input
word = "CDOZDPBVVVHNBJVBYHEOXWFLJKRWJCAJMIFCOZWWYFKVWOGTVJcuusigdqfkumewjtdyitveeiaybwrhomrwmpdipjwiuxfnwuz"
print(codeforces_59_A(word))
```

This Python function works similarly to the Java code. It counts the number of uppercase and lowercase letters in the input string, then returns the string in uppercase if there are more uppercase letters, in lowercase if there are more lowercase letters, or in lowercase if there are an equal number of uppercase and lowercase letters.
<|EOT|>
