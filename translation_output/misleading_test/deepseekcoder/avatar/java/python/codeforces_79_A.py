<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 20

Expected output:
Cqiel

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class codeforces_79_A {
    public static boolean canTake(int xNeeded, int xAvailable, int yNeeded, int yAvailable) {
        if (xNeeded > xAvailable)
            return false;
        if (yNeeded > yAvailable)
            return false;
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int turn = 0;
        while (true) {
            if (turn % 2 == 0) {
                if (canTake(2, x, 2, y)) {
                    x -= 2;
                    y -= 2;
                } else if (canTake(1, x, 12, y)) {
                    x -= 1;
                    y -= 12;
                } else if (canTake(0, x, 22, y)) {
                    y -= 22;
                } else {
                    System.out.println("Hanako");
                    return;
                }
            } else {
                if (canTake(0, x, 22, y)) {
                    y -= 22;
                } else if (canTake(1, x, 12, y)) {
                    x -= 1;
                    y -= 12;
                } else if (canTake(2, x, 2, y)) {
                    x -= 2;
                    y -= 2;
                } else {
                    System.out.println("Ciel");
                    return;
                }
            }
            turn++;
        }
    }
}
```

### Response:
```python
def can_take(x_needed, x_available, y_needed, y_available):
    if x_needed > x_available:
        return False
    if y_needed > y_available:
        return False
    return True

def main():
    x, y = map(int, input().split())
    turn = 0
    while True:
        if turn % 2 == 0:
            if can_take(2, x, 2, y):
                x -= 2
                y -= 2
            elif can_take(1, x, 12, y):
                x -= 1
                y -= 12
            elif can_take(0, x, 22, y):
                y -= 22
            else:
                print("Hanako")
                return
        else:
            if can_take(0, x, 22, y):
                y -= 22
            elif can_take(1, x, 12, y):
                x -= 1
                y -= 12
            elif can_take(2, x, 2, y):
                x -= 2
                y -= 2
            else:
                print("Ciel")
                return
        turn += 1

if __name__ == "__main__":
    main()
```
<|EOT|>
