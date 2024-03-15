<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
[/INST]
```python
import sys

def canTake(xNeeded, xAvailable, yNeeded, yAvailable):
    if xNeeded > xAvailable:
        return False
    if yNeeded > yAvailable:
        return False
    return True

def main():
    with open(sys.stdin, 'r') as br:
        st = br.readline().split()
        x = int(st[0])
        y = int(st[1])
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
```</s>
