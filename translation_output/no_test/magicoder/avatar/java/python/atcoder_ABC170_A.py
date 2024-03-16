<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class atcoder_ABC170_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anser = 0;
        int[] count = new int[5];
        
        for (int i = 0; i < 5; i++) {
            int x = sc.nextInt();
            count[i] += x;
            
            if (count[i] == 0) {
                anser = i;
            }
        }
        
        System.out.println(anser + 1);
    }
}
```

@@ Response
```python
import sys

def main():
    count = [0] * 5
    ans = 0

    for i in range(5):
        x = int(sys.stdin.readline())
        count[i] += x

        if count[i] == 0:
            ans = i

    print(ans + 1)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads five integers from the standard input, stores them in the `count` list, and checks if any of them are zero. If a zero is found, it sets `ans` to the index of that zero. Finally, it prints the index of the first zero plus one.<｜end▁of▁sentence｜>
