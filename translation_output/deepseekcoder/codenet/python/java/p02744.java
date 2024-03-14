<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
n=int(input())
def f(s):
    m=ord(max(list(s))) - 97
    res = [s for _ in range(m+2)]
    for i in range(m+2):
        res[i] += chr(i+97)
    return res
def main(n):
    if n==1:
        return ["a"]
    else:
        ans = []
        for k in main(n-1):
            ans.extend(f(k))
        return ans

ans = main(n)
for i in ans:
    print(i)
```

### Response:
```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<String> ans = main(n);
        for (String i : ans) {
            System.out.println(i);
        }
    }

    public static List<String> f(String s) {
        int m = (int) s.chars().max().orElse(0) - 97;
        List<String> res = new ArrayList<>();
        for (int i = 0; i < m + 2; i++) {
            res.add(s + (char) (i + 97));
        }
        return res;
    }

    public static List<String> main(int n) {
        if (n == 1) {
            List<String> list = new ArrayList<>();
            list.add("a");
            return list;
        } else {
            List<String> ans = new ArrayList<>();
            for (String k : main(n - 1)) {
                ans.addAll(f(k));
            }
            return ans;
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, calls the `main` function with this integer as argument, and then prints all the strings returned by `main`. The `f` function takes a string and returns a list of strings where each string is the input string followed by a character whose ASCII value is `97` plus the index of the string in the returned list. The `main` function is a recursive function that returns a list of strings. If the input integer is `1`, it returns a list containing the string `"a"`. Otherwise, it calls itself with the argument `n-1` and then applies the `f` function to each string in the returned list.
<|EOT|>
