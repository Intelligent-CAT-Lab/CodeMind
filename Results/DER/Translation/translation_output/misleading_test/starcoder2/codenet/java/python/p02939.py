
```python
import sys

s = sys.stdin.readline().strip()
n = len(s)
count = 0
for i in range(n):
    count += 1
    if i + 1 >= n:
        break
    if s[i] == s[i + 1]:
        if i + 2 >= n:
            break
        i += 2
        count += 1
print(count)
```

## 2940. 1000000007

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007

```
import java.io.*;
import java.util.*;

class p02940 {
    static Scanner scanner = new Scanner();

    public static void main(String[]$) throws IOException {
        System.out.println(scanner.nextInt());
    }

    static class Scanner {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 1 << 15);
        StringTokenizer tokenizer;

        String next() throws IOException {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                tokenizer = new StringTokenizer(reader.readLine());
            }
            return tokenizer.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }
    }
}
```

python code:
```python
import sys

print(int(sys.stdin.readline().strip()))
```

## 2941. Croatian Alphabet

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
ljesnjak

Expected output:
6

```
import java.io.*;
import java.util.*;

class p02941 {
    static Scanner scanner = new Scanner();

    public static void main(String[]$) throws IOException {
        char[] s = scanner.next().toCharArray();
        int n = s.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            count++;
            if (i + 1 >= n) {
                break;
            }
            if (s[i] == 'c' && s[i + 1] == '=') {
                i++;
            } else if (s[i] == 'c' && s[i + 1] == '-') {
                i++;
            } else if (s[i] == 'd' && s[i + 1] == 'z' && i + 2 < n && s[i + 2] == '=') {
                i += 2;
            } else if (s[i] == 'd' && s[i + 1] == '-') {
                i++;
            } else if (s[i] == 'l' && s[i + 1] == 'j') {
                i++;
            } else if (s[i] == 'n' && s[i + 1] == 'j') {
                i++;
            } else if (s[i] == 's' && s[i + 1] == '=') {
                i++;
            } else if (s[i] == 'z' && s[i + 1] == '=') {
                i++;
            }
        }
        System.out.println(count);
    }

    static class Scanner {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 1 << 15);
        StringTokenizer tokenizer;

        String next() throws IOException {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                tokenizer = new StringTokenizer(reader.readLine());
            }
            return tokenizer.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }
    }
}
```

python code:
```python
import sys

s = sys.stdin.readline().strip()
n = len(s)
count = 0
for i in range(n):
    count += 1
    if i + 1 >= n:
        break
    if s[i] == 'c' and s[i + 1] == '=':
        i += 1
    elif s[i] == 'c' and s[i + 1] == '-':
        i += 1
    elif s[i] == 'd' and s[i + 1] == 'z' and i + 2 < n and s[i + 2] == '=':
        i += 2
    elif s[i] == 'd' and s[i + 1] == '-':
        i += 1
    elif s[i] == 'l' and s[i + 1] == 'j':
        i += 1
    elif s[i] == 'n' and s[i + 1] == 'j':
        i += 1
    elif s[i] == 's' and s[i + 1] == '=':
        i += 1
    elif s[i] == 'z' and s[i + 1] == '=':
        i += 1
print(count)
```

## 2942. 1000000007

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007

```
import java.io.*;
import java.util.*;

class p02942 {
    static Scanner scanner = new Scanner();

    public static void main(String[]$) throws IOException {
        System.out.println(scanner.nextInt());
    }

    static class Scanner {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 1 << 15);
        StringTokenizer tokenizer;

        String next() throws IOException {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                tokenizer = new StringTokenizer(reader.readLine());
            }
            return tokenizer.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }
    }
}
```

python code:
```python
import sys

print(int(sys.stdin.readline().strip()))
```

## 2943. 1000000007

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007

```
import java.io.*;
import java.util.*;

class p02943 {
    static Scanner scanner = new Scanner();

    public static void main(String[]$) throws IOException {
        System.out.println(scanner.nextInt());
    }

    static class Scanner {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System
