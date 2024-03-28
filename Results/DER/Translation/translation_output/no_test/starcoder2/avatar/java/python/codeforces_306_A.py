
```
import math
n, m = map(float, input().split())
for i in range(int(m - (n % m))):
    print(int(n / m), end=" ")
for i in range(int(m - (n % m)), int(m)):
    print(math.ceil(n / m), end=" ")
```

## 306B - Sereja and Contests

### 题目大意

给定n个比赛，每个比赛有两个参数a和b，分别表示参加这个比赛的人数和这个比赛的难度。

Sereja要参加m个比赛，他想知道他最少要参加多少个难度为x的比赛，才能保证他参加的比赛的难度之和不小于x。

### 解题思路

贪心，先将比赛按照难度从小到大排序，然后从难度最小的比赛开始，如果当前的难度之和小于x，就将当前的比赛参加，否则就不参加。

### 代码

```
import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class codeforces_306_B {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osr = new OutputStreamWriter(System.out);
        PrintWriter o = new PrintWriter(osr);
        FastReader fr = new FastReader();
        int n = fr.nextInt(), m = fr.nextInt(), x = fr.nextInt();
        Pair[] arr = new Pair[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Pair(fr.nextInt(), fr.nextInt());
        }
        Arrays.sort(arr, new Pair.Compare());
        int sum = 0, ans = 0;
        for (int i = 0; i < n; i++) {
            if (sum < x) {
                sum += arr[i].y;
                ans++;
            }
        }
        o.println(ans);
        o.close();
    }
}

class FastReader {
    BufferedReader br;
    StringTokenizer st;

    public FastReader() {
        InputStreamReader isr = new InputStreamReader(System.in);
        br = new BufferedReader(isr);
    }

    public String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }

    public String nextLine() throws IOException {
        return br.readLine();
    }

    public int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    public long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    public double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }

    public int[] intArray(int size) throws IOException {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = nextInt();
        }
        return arr;
    }

    public char[] charArray() throws IOException {
        return nextLine().toCharArray();
    }
}

class Pair {
    int x;
    int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    static class Compare implements Comparator<Pair> {
        @Override
        public int compare(Pair o1, Pair o2) {
            return (o1.y - o2.y);
        }
    }
}
```

## 306C - Sereja and Stairs

### 题目大意

给定n个台阶，每个台阶有两个参数a和b，分别表示这个台阶的高度和这个台阶的难度。

Sereja要爬m个台阶，他想知道他最少要爬多少个难度为x的台阶，才能保证他爬的台阶的难度之和不小于x。

### 解题思路

贪心，先将台阶按照高度从小到大排序，然后从高度最小的台阶开始，如果当前的难度之和小于x，就将当前的台阶爬上去，否则就不爬。

### 代码

```
import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class codeforces_306_C {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osr = new OutputStreamWriter(System.out);
        PrintWriter o = new PrintWriter(osr);
        FastReader fr = new FastReader();
        int n = fr.nextInt(), m = fr.nextInt(), x = fr.nextInt();
        Pair[] arr = new Pair[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Pair(fr.nextInt(), fr.nextInt());
        }
        Arrays.sort(arr, new Pair.Compare());
        int sum = 0, ans = 0;
        for (int i = 0; i < n; i++) {
            if (sum < x) {
                sum += arr[i].y;
                ans++;
            }
        }
        o.println(ans);
        o.close();
    }
}

class FastReader {
    BufferedReader br;
    StringTokenizer st;

    public FastReader() {
        InputStreamReader isr = new InputStreamReader(System.in);
        br = new BufferedReader(isr);
    }

    public String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }

    public String nextLine() throws IOException {
        return br.readLine();
    }

    public int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    public long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    public double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }

    public int[] intArray(int size) throws IOException {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = nextInt();
        }
        return arr;
    }

    public char[] charArray() throws IOException {
        return nextLine().toCharArray();
    }
}

class Pair {
    int x;
    int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    static class Compare implements Comparator<Pair> {
        @Override
        public int compare(Pair o1, Pair
