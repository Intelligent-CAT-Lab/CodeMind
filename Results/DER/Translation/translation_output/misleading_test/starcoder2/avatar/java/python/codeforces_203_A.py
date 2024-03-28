
```python
import sys

def main():
    points, t, a, b, ta, tb = map(int, sys.stdin.readline().split())
    for i in range(t + 1):
        for j in range(t + 1):
            if points == a - i * ta + b - j * tb or (points == 0) or points == a - ta * i or points == b - tb * j:
                print("YES")
                return
    print("NO")

if __name__ == "__main__":
    main()
```


```

python code:
```python
import sys

def main():
    n = int(sys.stdin.readline())
    a = list(map(int, sys.stdin.readline().split()))
    b = list(map(int, sys.stdin.readline().split()))
    a.sort()
    b.sort()
    print(sum(a[i] * b[n - i - 1] for i in range(n)))

if __name__ == "__main__":
    main()
```
/codeforces/203_B.md
# B. Two Bags of Potatoes

## Problem

Little Petya very much likes potatoes. He has two bags of potatoes. The first bag contains a1 potatoes, the second one contains b1 potatoes. Petya decided to mix the potatoes from both bags into one bag. He can do this in two ways:

1. He can take exactly a1 potatoes from the first bag and exactly b1 potatoes from the second bag and put them into the new bag.
2. He can take exactly a2 potatoes from the first bag and exactly b2 potatoes from the second bag and put them into the new bag.

Petya wants to know how many ways he can mix the potatoes from both bags into one bag. Help him to find the number of ways to mix the potatoes.

## Input

The first line contains two space-separated integers a1 and b1 (1 ≤ a1, b1 ≤ 100). The second line contains two space-separated integers a2 and b2 (1 ≤ a2, b2 ≤ 100).

## Output

Print a single integer — the number of ways to mix the potatoes.

## Sample test(s)

input
```
2 3
3 2
```

output
```
4
```

input
```
1 1
1 1
```

output
```
1
```

## Note

In the first sample test Petya can mix the potatoes in four ways:

1. Take 2 potatoes from the first bag and 3 potatoes from the second bag.
2. Take 2 potatoes from the first bag and 2 potatoes from the second bag.
3. Take 1 potato from the first bag and 3 potatoes from the second bag.
4. Take 1 potato from the first bag and 2 potatoes from the second bag.

In the second sample test Petya can mix the potatoes in only one way: take 1 potato from the first bag and 1 potato from the second bag.

## Solution

```
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

public class codeforces_203_B {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BTwoBagsOfPotatoes solver = new BTwoBagsOfPotatoes();
        solver.solve(1, in, out);
        out.close();
    }

    static class BTwoBagsOfPotatoes {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int a1 = in.nextInt();
            int b1 = in.nextInt();
            int a2 = in.nextInt();
            int b2 = in.nextInt();
            int count = 0;
            for (int i = 0; i <= a1; i++) {
                for (int j = 0; j <= b1; j++) {
                    if (i * a2 + j * b2 == a1 * b1) {
                        count++;
                    }
                }
            }
            out.println(count);
        }
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
```

python code:
```python
import sys

def main():
    a1, b1 = map(int, sys.stdin.readline().split())
    a2, b2 = map(int, sys.stdin.readline().split())
    count = 0
    for i in range(a1 + 1):
        for j in range(b1 + 1):
            if i * a2 + j * b2 == a1 * b1:
                count += 1
    print(count)

if __name__ == "__main__":
    main()
```

# C. Two Problems

## Problem

Little Petya very much likes problems. He has recently learned two problems. The first problem is about two integers a and b. The second problem is about two integers c and d. Petya wants to solve both problems.

Petya has n minutes to solve the problems. He wants to solve the first problem in exactly a minutes and the second problem in exactly c minutes.

Petya can solve the problems in the following way:

1. He can solve the first problem in exactly a minutes.
2. He can solve the second problem in exactly c minutes.
3. He can solve the first problem in exactly a - ta minutes and the second problem in exactly
