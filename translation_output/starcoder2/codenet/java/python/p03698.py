
```
import sys

input_string = sys.stdin.readline().strip()

if len(input_string) == len(set(input_string)):
    print("yes")
else:
    print("no")
```

## 3. 10809번

### 문제

알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.

### 입력

첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.

### 출력

각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... z가 처음 등장하는 위치를 공백으로 구분해서 출력한다.

만약, 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다. 단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치이다.

### 예제 입력 1

```
baekjoon
```

### 예제 출력 1

```
1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1
```

### 예제 입력 2

```
z
```

### 예제 출력 2

```
0
```

### 예제 입력 3

```
baekjoononlinejudge
```

### 예제 출력 3

```
1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 8 6 -1 -1 9 -1 -1 -1 -1 -1 -1
```

### 힌트

### 출처

- 문제를 만든 사람: [baekjoon](https://www.acmicpc.net/user/baekjoon)

### 알고리즘 분류

- [구현](https://www.acmicpc.net/problem/tag/115)

### Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class p010809 {
    public static void main(final String[] args) throws Exception {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            String inputString = br.readLine();
            int[] ans = new int[26];
            Arrays.fill(ans, -1);
            for (int i = 0; i < inputString.length(); i++) {
                int index = inputString.charAt(i) - 'a';
                if (ans[index] == -1) {
                    ans[index] = i;
                }
            }

            for (int i = 0; i < ans.length; i++) {
                System.out.print(ans[i] + " ");
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}
```

python code:
```
import sys

input_string = sys.stdin.readline().strip()

for i in range(26):
    print(input_string.find(chr(ord('a') + i)), end=' ')
```

## 4. 11654번

### 문제

알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.

### 입력

알파벳 소문자, 대문자, 숫자 0-9 중 하나가 첫째 줄에 주어진다.

### 출력

입력으로 주어진 글자의 아스키 코드 값을 출력한다.

### 예제 입력 1

```
A
```

### 예제 출력 1

```
65
```

### 예제 입력 2

```
C
```

### 예제 출력 2

```
67
```

### 예제 입력 3

```
0
```

### 예제 출력 3

```
48
```

### 예제 입력 4

```
9
```

### 예제 출력 4

```
57
```

### 예제 입력 5

```
a
```

### 예제 출력 5

```
97
```

### 예제 입력 6

```
z
```

### 예제 출력 6

```
122
```

### 힌트

### 출처

- 문제를 만든 사람: [baekjoon](https://www.acmicpc.net/user/baekjoon)

### 알고리즘 분류

- [구현](https://www.acmicpc.net/problem/tag/115)

### Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class p011654 {
    public static void main(final String[] args) throws Exception {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            char inputChar = (char) br.read();
            System.out.println((int) inputChar);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}
```

python code:
```
import sys

input_char = sys.stdin.read(1)

print(ord(input_char))
```


### 예제 입력 1

```
5
```

### 예제 출력 1

```
1
```

### 예제 입력 2

```
10
```

### 예제 출력 2

```
3
```

### 예제 입력 3

```
13
```

### 예제 출력 3

```
6
```

### 예제 입력 4

```
0
```

### 예제 출력 4

```
0
```

### 힌트

### 출처

- 문제를 만든 사람: [baekjoon](https://www.acmicpc.net/user/baekjoon)

### 알고리즘 분류

- [수학](https://www.acmicpc.net/problem/tag/20)
- [정수론](https://www.acmicpc.net/problem/
