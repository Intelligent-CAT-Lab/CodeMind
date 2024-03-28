<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
```python
import sys

def func(n):
    list = []
    if n == 1:
        list.append("a")
    else:
        prev_list = func(n - 1)
        for s in prev_list:
            max_char = ord('a')
            for i in range(len(s)):
                if max_char < ord(s[i]):
                    max_char = ord(s[i])
            for c in range(ord('a'), max_char + 1):
                new_string = s + chr(c)
                list.append(new_string)
    return list

n = int(input())
list = func(n)
for s in list:
    print(s)
```</s>
