Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class codeforces_306_A {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osr = new OutputStreamWriter(System.out);
        PrintWriter o = new PrintWriter(osr);
        FastReader fr = new FastReader();
        double n = fr.nextDouble(), m = fr.nextDouble();
        for (int i = 0; i < m - (n % m); i++) {
            o.print((int) (n / m) + " ");
        }
        for (int i = (int) (m - (n % m)); i < m; i++) {
            o.print((int) ceil(n / m) + " ");
        }
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
        while (st == null ||!st.hasMoreTokens()) {
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

### Response:
```python
import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class codeforces_306_A {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osr = new OutputStreamWriter(System.out);
        PrintWriter o = new PrintWriter(osr);
        FastReader fr = new FastReader();
        double n = fr.nextDouble(), m = fr.nextDouble();
        for (int i = 0; i < m - (n % m); i++) {
            o.print((int) (n / m) + " ");
        }
        for (int i = (int) (m - (n % m)); i < m; i++) {
            o.print((int) ceil(n / m) + " ");
        }
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
        while (st == null ||!st.hasMoreTokens()) {
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
```<|endoftext|>
