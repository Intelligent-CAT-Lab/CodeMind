<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02755 {
    public static void main(String[] args) {
        new p02755().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if(A > B) {
            System.out.println(-1);
            return;
        }

        for(int i = 1; i < 99999999; i ++) {
            if((int)(i * 0.08) == A &&  (int)(i * 0.10) == B) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}

```
[/INST]
```python
import sys

def main():
    A = int(input())
    B = int(input())

    if A > B:
        print(-1)
        return

    for i in range(1, 100000000):
        if (i * 0.08) == A and (i * 0.10) == B:
            print(i)
            return

    print(-1)

if __name__ == "__main__":
    main()
```</s>
