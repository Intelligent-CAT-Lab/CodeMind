<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class atcoder_ABC164_A {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> scList = new ArrayList<>();

        scList.add(scan.nextLine());

        String[] numlist = scList.get(0).split(" ");
        int Sheep = Integer.parseInt(numlist[0]);
        int Wolve = Integer.parseInt(numlist[1]);

        if (Wolve >= Sheep) {
            System.out.println("unsafe");
        } else {
            System.out.println("safe");
        }
    }
}
```

@@ Response
```python
import sys

def main():
    scList = sys.stdin.readline().split()
    Sheep = int(scList[0])
    Wolve = int(scList[1])

    if Wolve >= Sheep:
        print("unsafe")
    else:
        print("safe")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, checks if the second integer is greater than or equal to the first, and prints "unsafe" if it is, or "safe" if it isn't.<｜end▁of▁sentence｜>
