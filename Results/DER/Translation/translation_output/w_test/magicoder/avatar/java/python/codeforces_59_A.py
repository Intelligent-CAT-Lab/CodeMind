<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
CDOZDPBVVVHNBJVBYHEOXWFLJKRWJCAJMIFCOZWWYFKVWOGTVJcuusigdqfkumewjtdyitveeiaybwrhomrwmpdipjwiuxfnwuz

Expected output:
CDOZDPBVVVHNBJVBYHEOXWFLJKRWJCAJMIFCOZWWYFKVWOGTVJCUUSIGDQFKUMEWJTDYITVEEIAYBWRHOMRWMPDIPJWIUXFNWUZ


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

@@ Response
```python
def solve(word):
    uppercase = sum(1 for c in word if c.isupper())
    lowercase = sum(1 for c in word if c.islower())

    if uppercase > lowercase:
        return word.upper()
    elif lowercase > uppercase:
        return word.lower()
    else:
        return word.lower()

word = input()
print(solve(word))
```

This Python code does the same thing as the Java code. It counts the number of uppercase and lowercase letters in the input string, and then returns the string in the case that has more letters. If the number of uppercase and lowercase letters are equal, it returns the string in lowercase.<｜end▁of▁sentence｜>
