<s> Translate the following java code to python and enclose your solution inside ```python```:
```
//package com.atcoder.contest174.a;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p02594 {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int x = fs.nextInt();
        if(x >= 30) System.out.println("Yes");
        else System.out.println("No");
    }

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}

```

## 解答

```python
#!/usr/bin/env python3

import sys


def main():
    x = int(sys.stdin.readline())
    if x >= 30:
        print("Yes")
    else:
        print("No")


if __name__ == "__main__":
    main()
```

## 解説

### 入力

- 入力は1行で、整数xが与えられる。

### 出力

- 整数xが30以上であれば「Yes」、そうでなければ「No」を出力する。

### 備考

- 入力はステージ1の問題と同じである。
</s>
