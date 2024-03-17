Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
..

Expected output:
00


```
import java.util.Scanner;

public class codeforces_32_B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        String str = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '.') {
                str += 0;
            } else {
                if (s.charAt(i) == '-' && s.charAt(i + 1) == '.') {
                    str += 1;
                } else {
                    str += 2;
                    i++;
                }
            }
        }

        System.out.println(str);
    }
}
```

### Response:
```python
import java.util.Scanner;

public class codeforces_32_B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        String str = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '.') {
                str += "0";
            } else {
                if (s.charAt(i) == '-' && s.charAt(i + 1) == '.') {
                    str += "1";
                } else {
                    str += "2";
                    i++;
                }
            }
        }

        System.out.println(str);
    }
}
```

Explanation:

- We first import the `java.util.Scanner` class to read input from the user.
- We then create a `Scanner` object to read input from the user.
- We read the input string `s` from the user using the `next()` method of the `Scanner` class.
- We create an empty string `str` to store the output.
- We loop through each character of the input string `s` using a `for` loop.
- If the current character is a `.`, we append a `0` to the output string `str`.
- If the current character is a `-` and the next character is a `.`, we append a `1` to the output string `str`.
- If the current character is not a `.` or `-`, we append a `2` to the output string `str` and increment the loop counter `i` by 1 to skip the next character.
- Finally, we print the output string `str` to the console using the `println()` method of the `System.out` object.<|endoftext|>
