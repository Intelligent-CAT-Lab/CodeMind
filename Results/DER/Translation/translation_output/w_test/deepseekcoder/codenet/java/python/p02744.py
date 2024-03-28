<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1

Expected output:
a


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

### Response:
```python
def func(n):
    list = []
    if n == 1:
        list.append("a")
    else:
        prevList = func(n - 1)
        for s in prevList:
            max = 'a'
            for i in range(len(s)):
                if max < s[i]:
                    max = s[i]
            for c in range(ord(max)+1, ord('z')+1):
                newString = s + chr(c)
                list.append(newString)
    return list

n = int(input())
list = func(n)
for s in list:
    print(s)
```

This Python code does the same thing as the Java code. It generates all possible strings of length `n` that can be formed by using the letters 'a' to 'z' in lexicographic order. The function `func` generates these strings recursively. It starts with the string "a" and then adds each letter of the alphabet to the end of each string in the previous list, until it has generated all possible strings of length `n`. The result is then printed to the console.
<|EOT|>
