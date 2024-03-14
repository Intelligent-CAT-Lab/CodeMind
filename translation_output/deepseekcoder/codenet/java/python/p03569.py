<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p03569 {
    public void main(Scanner sc) {
        String s = sc.next();
        int length = s.length();

        int cnt = 0;
        int l = 0;
        int r = length - 1;
        while (l <= r) {
            char cl = s.charAt(l);
            char cr = s.charAt(r);

            if (cl == cr) {
                l++;
                r--;
            } else {
                if (cl == 'x') {
                    cnt++;
                    l++;
                } else if (cr == 'x') {
                    cnt++;
                    r--;
                } else {
                    cnt = -1;
                    break;
                }
            }
        }

        System.out.println(cnt);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new p03569().main(sc);
        sc.close();
    }
}

```

### Response:
```python
class p03569:
    def main(self, sc):
        s = sc.next()
        length = len(s)

        cnt = 0
        l = 0
        r = length - 1
        while l <= r:
            cl = s[l]
            cr = s[r]

            if cl == cr:
                l += 1
                r -= 1
            else:
                if cl == 'x':
                    cnt += 1
                    l += 1
                elif cr == 'x':
                    cnt += 1
                    r -= 1
                else:
                    cnt = -1
                    break

        print(cnt)

if __name__ == "__main__":
    sc = input()
    p03569().main(sc)
```

This Python code does the same thing as the Java code. It reads a string from the input, then checks if it's a palindrome by comparing characters from both ends. If it's not a palindrome, it counts the number of 'x's that need to be added to make it a palindrome. If it's impossible to make it a palindrome, it prints -1.
<|EOT|>
