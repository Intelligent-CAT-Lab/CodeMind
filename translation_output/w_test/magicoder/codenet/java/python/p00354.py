<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1

Expected output:
fri


```
import java.util.Scanner;
public class p00354 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("thu:fri:sat:sun:mon:tue:wed".split(":")[sc.nextInt()%7]);
    }
}

```

@@ Response
```python
def main():
    days = ["thu", "fri", "sat", "sun", "mon", "tue", "wed"]
    day_index = int(input()) % 7
    print(days[day_index])

if __name__ == "__main__":
    main()
```

In this Python code, we first define a list of days of the week. Then we take an input from the user and find the remainder when divided by 7. This is because there are only 7 days in a week. We then print the day of the week corresponding to the index obtained.<｜end▁of▁sentence｜>
