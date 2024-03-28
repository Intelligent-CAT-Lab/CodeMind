<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
import sys

def main():
    n = int(sys.stdin.readline().strip())
    result = func(n)
    for s in result:
        print(s)

def func(n):
    if n == 1:
        return ['a']
    else:
        prev_list = func(n - 1)
        result = []
        for s in prev_list:
            max_char = max(s)
            for c in range(ord(max_char)+1, ord('z')+2):
                result.append(s + chr(c))
        return result

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, calls the `func` function with this integer as argument, and then prints the result. The `func` function generates all possible strings of length `n` by appending a new character to each string in the previous list. The new character is chosen to be the next character in the alphabet after the maximum character in the previous string.
<|EOT|>
