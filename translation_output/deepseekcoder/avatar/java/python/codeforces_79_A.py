<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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
import sys
import io

def canTake(xNeeded, xAvailable, yNeeded, yAvailable):
    if xNeeded > xAvailable:
        return False
    if yNeeded > yAvailable:
        return False
    return True

def main():
    input_str = sys.stdin.readline().split()
    x = int(input_str[0])
    y = int(input_str[1])
    turn = 0
    while True:
        if turn % 2 == 0:
            if canTake(2, x, 2, y):
                x -= 2
                y -= 2
            elif canTake(1, x, 12, y):
                x -= 1
                y -= 12
            elif canTake(0, x, 22, y):
                y -= 22
            else:
                print("Hanako")
                return
        else:
            if canTake(0, x, 22, y):
                y -= 22
            elif canTake(1, x, 12, y):
                x -= 1
                y -= 12
            elif canTake(2, x, 2, y):
                x -= 2
                y -= 2
            else:
                print("Ciel")
                return
        turn += 1

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, and then enters a loop where it alternately tries to take certain amounts of stones from the pile. The function `canTake` checks if it can take the specified amount of stones. If it can, it updates the number of stones in the pile and continues. If it can't, it prints the name of the player who won and returns.
<|EOT|>
