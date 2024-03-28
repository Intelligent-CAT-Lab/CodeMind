

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

Petya wants to know how many ways he can mix the potatoes.

## Input

The first line contains two integers a1 and b1 (1 ≤ a1, b1 ≤ 100). The second line contains two integers a2 and b2 (1 ≤ a2, b2 ≤ 100).

## Output

Print a single integer — the number of ways to mix the potatoes.

## Sample Input

```
2 3
3 2
```

## Sample Output

```
4
```

## Hint

In the first sample there are four ways to mix the potatoes:

1. Take 2 potatoes from the first bag and 2 potatoes from the second bag.
2. Take 2 potatoes from the first bag and 3 potatoes from the second bag.
3. Take 1 potato from the first bag and 3 potatoes from the second bag.
4. Take 0 potatoes from the first bag and 3 potatoes from the second bag.

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
                    if (i * a2 + j * b2 == a1 + b1) {
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
```/codeforces/203_C.md
# C. Two Tables

## Problem

Little Petya has a rectangular table consisting of n rows and m columns. Each cell of the table contains a digit from 0 to 9. Petya wants to write a number on the table. He has a rectangular piece of paper with size a × b. The number can be written on the table if its size is not greater than the size of the piece of paper. The size of the number is the number of cells of the table it occupies.

Petya wants to write a number on the table in such a way that the sum of the numbers in the cells of the table is maximum possible. Help Petya to find the maximum possible sum of the numbers in the cells of the table.

## Input

The first line contains four integers n, m, a and b (1 ≤ n, m, a, b ≤ 100). Then n lines follow, each of them contains m integers. The j-th number in the i-th line is the digit that is written in the corresponding cell of the table (0 ≤ digit ≤ 9).

## Output

Print a single integer — the maximum possible sum of the numbers in the cells of the table.

## Sample Input

```
3 3 2 2
1 2 3
4 5 6
7 8 9
```

## Sample Output

```
45
```

## Hint

In the sample test the number 9 can be written on the table in
