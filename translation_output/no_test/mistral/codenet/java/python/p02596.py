<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
import java.io.*;

public class p02596 {
	public static void main(String[] args) throws IOException {
		setIO();

		int N = ni();
		
		int l = Integer.toString(N).length();
		int m = 0;
		for (int i = 0; i < l; i++) {
			m = (10 * m + 7) % N;
		}
		
		int i = l;
		boolean[] vis = new boolean[N];
		
		while (true) {
			if (vis[m]) {
				out.println(-1);
				break;
			}
			
			vis[m] = true;
			
			if (m == 0) {
				out.println(i);
				break;
			}
			
			m = (10 * m + 7) % N;
			i++;
		}
		
		f.close();
		out.close();
	}

	static final int MOD = 1000000007;

	static BufferedReader f;
	static PrintWriter out;

	static int ni(StringTokenizer st) {
		return Integer.parseInt(st.nextToken());
	}

	static int ni() throws IOException {
		return Integer.parseInt(f.readLine());
	}

	static StringTokenizer nl() throws IOException {
		return new StringTokenizer(f.readLine());
	}

	static int[] nia(int N) throws IOException {
		StringTokenizer st = nl();
		int[] A = new int[N];
		for (int i = 0; i < N; i++)
			A[i] = ni(st);
		return A;
	}

	static void setIO(String s) throws IOException {
		f = new BufferedReader(new FileReader(s + ".in"));
		out = new PrintWriter(new FileWriter(s + ".out"));
	}

	static void setIO() {
		f = (new BufferedReader(new InputStreamReader(System.in)));
		out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	}
}

```
[/INST]
```python
import sys

def set_io(file_name):
    global f, out
    f = open(file_name + ".in", "r")
    out = open(file_name + ".out", "w")

def ni():
    return int(input())

def nl():
    return input().split()

def nia(N):
    st = nl()
    A = [ni(st) for _ in range(N)]
    return A

def main():
    set_io("p02596")
    N = ni()
    l = len(str(N))
    m = 0
    for i in range(l):
        m = (10 * m + 7) % N
    i = l
    vis = [False] * N
    while True:
        if vis[m]:
            print(-1)
            break
        vis[m] = True
        if m == 0:
            print(i)
            break
        m = (10 * m + 7) % N
        i += 1
    f.close()
    out.close()

if __name__ == "__main__":
    main()
```</s>
