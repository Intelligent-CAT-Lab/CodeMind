
```
a, b, c = map(int, input().split())
if a == b and b == c:
    print("Yes")
else:
    print("No")
```

## 3. 10817번

### 문제

세 정수 A, B, C가 주어진다. 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오. 

### 입력

첫째 줄에 세 정수 A, B, C가 공백으로 구분되어 주어진다. (1 ≤ A, B, C ≤ 100)

### 출력

두 번째로 큰 정수를 출력한다.

### 예제 입력 1 
```
20 30 10
```
### 예제 출력 1 
```
20
```

### 예제 입력 2 
```
30 30 10
```
### 예제 출력 2 
```
30
```

### 예제 입력 3 
```
40 40 40
```
### 예제 출력 3 
```
40
```

### 예제 입력 4 
```
20 10 10
```
### 예제 출력 4 
```
10
```

### 힌트

세 정수가 같은 경우가 있다.

### 출처

- 문제를 만든 사람: baekjoon

### 알고리즘 분류

- [정렬](https://www.acmicpc.net/problem/tag/정렬)

### Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p10817 {
    public static void main(String[] args) throws IOException {
        p10817 mainObj = new p10817();
        mainObj.solve();
    }

    public void solve() throws IOException {
        FastScanner fs = new FastScanner();
        int a = fs.nextInt();
        int b = fs.nextInt();
        int c = fs.nextInt();
        
        int[] arr = {a, b, c};
        Arrays.sort(arr);
        System.out.println(arr[1]);
    }

    

    public class FastScanner {

        BufferedReader reader;
        private StringTokenizer st;

        public FastScanner() {
            st = null;
            reader = new BufferedReader(new InputStreamReader(System.in));
        }

        public String next() throws IOException {
            if (st == null || !st.hasMoreElements()) {
                st = new StringTokenizer(reader.readLine());
            }
            return st.nextToken();
        }

        public String nextLine() throws IOException {
            st = null;
            String readLine = null;
            readLine = reader.readLine();
            return readLine;
        }

        public int nextInt() throws NumberFormatException, IOException {
            return Integer.parseInt(next());
        }

        public long nextLong() throws NumberFormatException, IOException {
            return Long.parseLong(next());
        }

        public int[] nextIntArr(int n) throws NumberFormatException, IOException {
            int[] retArr = new int[n];
            for (int i = 0; i < n; i++) {
                retArr[i] = nextInt();
            }
            return retArr;
        }

        public long[] nextLongArr(int n) throws NumberFormatException, IOException {
            long[] retArr = new long[n];
            for (int i = 0; i < n; i++) {
                retArr[i] = nextLong();
            }
            return retArr;
        }

        public void close() throws IOException {
            reader.close();
        }
    }


}

```

python code:
```
a, b, c = map(int, input().split())
arr = [a, b, c]
arr.sort()
print(arr[1])
```

## 4. 2523번

### 문제

예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.

### 입력

첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

### 출력

첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.

### 예제 입력 1 
```
3
```
### 예제 출력 1 
```
*
**
***
**
*
```

### 예제 입력 2 
```
5
```
### 예제 출력 2 
```
*
**
***
****
*****
****
***
**
*
```

### 예제 입력 3 
```
1
```
### 예제 출력 3 
```
*
```

### 예제 입력 4 
```
2
```
### 예제 출력 4 
```
*
**
**
*
```

### 예제 입력 5 
```
4
```
### 예제 출력 5 
```
*
**
***
****
****
***
**
*
```

### 힌트

출력 예제를 보고 규칙을 유추하세요.

### 출처

- 문제를 만든 사람: baekjoon

### 알고리즘 분류

- [구현](https://www.acmicpc.net/problem/tag/구현)

### Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2523 {
    public static void main(String[] args) throws IOException {
        p2523 mainObj = new p2523();
        mainObj.solve();
    }


