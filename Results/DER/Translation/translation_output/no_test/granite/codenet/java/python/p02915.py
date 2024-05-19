System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
```

import java.util.Scanner;

public class p02915 {
    public static void main(String[] args) {
        new p02915().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int S = scanner.nextInt();
        int ans = S * S* S;


        System.out.println(ans);
    }
}

```


Answer:
```python
import sys

def main():
    S = int(sys.stdin.readline())
    ans = S * S * S
    print(ans)

if __name__ == '__main__':
    main()
```<|endoftext|>
