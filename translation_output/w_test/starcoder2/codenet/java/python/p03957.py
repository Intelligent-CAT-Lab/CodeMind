

```
s = input()
cIndex = s.find('C')
fIndex = s.rfind('F')
if cIndex < 0 or fIndex < 0 or fIndex < cIndex:
    print('No')
else:
    print('Yes')
```

## C

```
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.io.Closeable;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;

/**
 * Built using CHelper plug-in Actual solution is at the top
 * 
 * @author daltao
 */
public class p03958 {
    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(null, new TaskAdapter(), "daltao", 1 << 27);
        thread.start();
        thread.join();
    }

    static class TaskAdapter implements Runnable {
        @Override
        public void run() {
            InputStream inputStream = System.in;
            OutputStream outputStream = System.out;
            FastInput in = new FastInput(inputStream);
            FastOutput out = new FastOutput(outputStream);
            TaskC solver = new TaskC();
            solver.solve(1, in, out);
            out.close();
        }
    }
    static class TaskC {
        public void solve(int testNumber, FastInput in, FastOutput out) {
            int n = in.readInt();
            int m = in.readInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.readInt();
            }
            int[] b = new int[m];
            for (int i = 0; i < m; i++) {
                b[i] = in.readInt();
            }
            int[] c = new int[n];
            for (int i = 0; i < n; i++) {
                c[i] = in.readInt();
            }
            int[] d = new int[m];
            for (int i = 0; i < m; i++) {
                d[i] = in.readInt();
            }
            int[] e = new int[n];
            for (int i = 0; i < n; i++) {
                e[i] = in.readInt();
            }
            int[] f = new int[m];
            for (int i = 0; i < m; i++) {
                f[i] = in.readInt();
            }
            int[] g = new int[n];
            for (int i = 0; i < n; i++) {
                g[i] = in.readInt();
            }
            int[] h = new int[m];
            for (int i = 0; i < m; i++) {
                h[i] = in.readInt();
            }
            int[] i = new int[n];
            for (int j = 0; j < n; j++) {
                i[j] = in.readInt();
            }
            int[] j = new int[m];
            for (int k = 0; k < m; k++) {
                j[k] = in.readInt();
            }
            int[] k = new int[n];
            for (int l = 0; l < n; l++) {
                k[l] = in.readInt();
            }
            int[] l = new int[m];
            for (int i1 = 0; i1 < m; i1++) {
                l[i1] = in.readInt();
            }
            int[] m1 = new int[n];
            for (int i2 = 0; i2 < n; i2++) {
                m1[i2] = in.readInt();
            }
            int[] n1 = new int[m];
            for (int i3 = 0; i3 < m; i3++) {
                n1[i3] = in.readInt();
            }
            int[] o = new int[n];
            for (int i4 = 0; i4 < n; i4++) {
                o[i4] = in.readInt();
            }
            int[] p = new int[m];
            for (int i5 = 0; i5 < m; i5++) {
                p[i5] = in.readInt();
            }
            int[] q = new int[n];
            for (int i6 = 0; i6 < n; i6++) {
                q[i6] = in.readInt();
            }
            int[] r = new int[m];
            for (int i7 = 0; i7 < m; i7++) {
                r[i7] = in.readInt();
            }
            int[] s = new int[n];
            for (int i8 = 0; i8 < n; i8++) {
                s[i8] = in.readInt();
            }
            int[] t = new int[m];
            for (int i9 = 0; i9 < m; i9++) {
                t[i9] = in.readInt();
            }
            int[] u = new int[n];
