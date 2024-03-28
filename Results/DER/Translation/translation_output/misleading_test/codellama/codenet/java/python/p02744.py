<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1

Expected output:


```


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p02744 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        scan.close();

        List<String> list = func(n);

        for (String s : list) {
            System.out.println(s);
        }

    }

    private static List<String> func(int n) {
        List<String> list = new ArrayList<String>();
        if (n == 1) {
            list.add("a");
        } else {
            List<String> prevList = func(n - 1);
            for (String s : prevList) {
                // å«ã¾ãã¦ããæå¤§ã®æå­ãæ¢ç´¢
                char max = 'a';
                for (int i = 0; i < s.length(); i++) {
                    if (max < s.charAt(i)) {
                        max = s.charAt(i);
                    }
                }

                for (char c = 'a'; c <= max + 1; c++) {
                    String newString = s + c;
                    list.add(newString);
                }
            }
        }
        return list;
    }
}

```
[/INST]

Here is the Python code that translates the Java code:
```python
import sys

def func(n):
    if n == 1:
        return ['a']
    else:
        prev_list = func(n - 1)
        result = []
        for s in prev_list:
            max_char = 'a'
            for i in range(len(s)):
                if max_char < s[i]:
                    max_char = s[i]
            for c in range(ord('a'), ord(max_char) + 2):
                new_string = s + chr(c)
                result.append(new_string)
        return result

n = int(sys.stdin.readline())
print('\n'.join(func(n)))
```
Note that the `chr()` function is used to convert the integer value of a character to a character, and the `ord()` function is used to convert a character to its integer value.</s>
