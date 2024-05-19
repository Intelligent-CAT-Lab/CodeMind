System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1

Expected output:
276

```
import java.util.Scanner;

public class atcoder_AGC046_A {
    public static void main(String[] args) {
        int i;
        int k = 360;
        int j = 1;
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) {
            System.err.println("æ´æ°ãå¥åãã¦ãã ãã");
        }

        i = Integer.parseInt(sc.nextLine());

        if (1 <= i && i <= 179) {
            while (!((i * j) % k == 0)) {
                ++j;
            }
            System.out.println(j);
        } else {
            System.out.println("åè»¢ããè§åº¦ã¯ï¼ ï½ ï¼ï¼ï¼ã®éã§å¥åãã¦ãã ããã");
        }
    }
}
```


Answer:
```python
import sys

def main():
    k = 360
    j = 1
    i = int(input())

    if 1 <= i <= 179:
        while (i * j) % k!= 0:
            j += 1
        print(j)
    else:
        print("Input is out of range.")

if __name__ == "__main__":
    main()
```

Test input:
```
1
```

Expected output:
```
276
```<|endoftext|>
