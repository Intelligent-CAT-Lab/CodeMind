<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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

@@ Response
```python
def func(n):
    if n == 1:
        return ['a']
    else:
        prev_list = func(n - 1)
        new_list = []
        for s in prev_list:
            max_char = max(s)
            for c in range(ord(max_char) + 1):
                new_string = s + chr(c)
                new_list.append(new_string)
        return new_list

n = int(input())
result = func(n)
for s in result:
    print(s)
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, calls the `func` function with this integer as the argument, and then prints each string returned by `func`. The `func` function generates all possible strings of length `n` by recursively appending each character to each string of length `n - 1`.<｜end▁of▁sentence｜>
