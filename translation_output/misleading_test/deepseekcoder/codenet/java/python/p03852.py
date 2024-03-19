<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
a

Expected output:
vowel

```
import java.util.Scanner;

public class  p03852{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //
        String c = sc.nextLine();

        if (c.equals("a")) {
            System.out.println("vowel");
        } else if (c.equals("i")) {
            System.out.println("vowel");
        } else if (c.equals("u")) {
            System.out.println("vowel");
        } else if (c.equals("e")) {
            System.out.println("vowel");
        } else if (c.equals("o")) {
            System.out.println("vowel");
        } else {
            System.out.println("consonant");
        }
    }

}
```

### Response:
```python
def p03852():
    c = input()

    if c == "a":
        print("vowel")
    elif c == "i":
        print("vowel")
    elif c == "u":
        print("vowel")
    elif c == "e":
        print("vowel")
    elif c == "o":
        print("vowel")
    else:
        print("consonant")

p03852()
```
<|EOT|>
