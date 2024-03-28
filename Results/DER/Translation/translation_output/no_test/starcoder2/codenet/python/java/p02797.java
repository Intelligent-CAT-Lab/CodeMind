
```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());

        int[] A = new int[N];
        Arrays.fill(A, S);
        if (S == 1000000000) {
            for (int i = 0; i < N - K; i++) {
                A[i] = S - 1;
            }
        } else {
            for (int i = 0; i < N - K; i++) {
                A[i] = 1000000000;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(A[i]).append(" ");
        }
        System.out.println(sb);
    }
}
```

## 2. 1000000000000000000

### 2.1. Problem

[1000000000000000000](https://atcoder.jp/contests/abc173/tasks/abc173_c)

### 2.2. Solution

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        char[][] A = new char[H][W];
        for (int i = 0; i < H; i++) {
            A[i] = br.readLine().toCharArray();
        }

        int ans = 0;
        for (int i = 0; i < (1 << H); i++) {
            for (int j = 0; j < (1 << W); j++) {
                int cnt = 0;
                for (int h = 0; h < H; h++) {
                    for (int w = 0; w < W; w++) {
                        if (((i >> h) & 1) == 0 && ((j >> w) & 1) == 0 && A[h][w] == '#') {
                            cnt++;
                        }
                    }
                }
                if (cnt == K) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
```

## 3. 1000000000000000000

### 3.1. Problem

[1000000000000000000](https://atcoder.jp/contests/abc173/tasks/abc173_d)

### 3.2. Solution

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);

        long ans = 0;
        long sum = 0;
        for (int i = N - 1; i >= 0; i--) {
            ans += sum;
            if (i > 0) {
                sum += A[i];
            }
        }
        System.out.println(ans);
    }
}
```
  }
        }
        System.out.println(ans);
    }
}
```

## 3. 1000000000000000000

### 3.1. Problem

[1000000000000000000](https://atcoder.jp/contests/abc173/tasks/abc173_d)

### 3.2. Solution

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);

        long ans = 0;
        long sum = 0;
        for (int i = N - 1; i >= 0; i--) {
            ans += sum;
            if (i > 0) {
                sum += A[i];
            }
        }
        System.out.println(ans);
    }
}
```
/ABC/ABC173/README.md
# ABC173

## 1. 1000000000000000000

### 1.1. Problem

[1000000000000000000](https://atcoder.jp/contests/abc173/tasks/abc173_a)

### 1.2. Solution

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println((N % 1000 == 0) ? 0 : 1000 - N % 1000);
    }
}
```

## 2. 1000000000000000000

### 2.1. Problem

[1000000000000000000](https://atcoder.jp/contests/abc173/tasks/abc173_b)

### 2.2. Solution

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] cnt = new int[4];
        for (int i = 0; i < N; i++) {
            String S = br.readLine();
            if (S.equals("AC")) {
                cnt[0]++;
            } else if (S.equals("WA")) {
                cnt[1]++;
            } else if (S.equals("TLE")) {
                cnt[2]++;
            } else {
                cnt[3]++;
            }
        }
        System.out.println("AC x " + cnt[0]);
        System.out.println("WA x " + cnt[1]);
        System.out.println("TLE x " + cnt[2]);
        System.out.println("RE x " + cnt[3]);
    }
}
```

## 3. 1000000000000000000

### 3.1. Problem

[1000000000000000000](https://atcoder.jp/contests/abc173/tasks/abc173_c)

