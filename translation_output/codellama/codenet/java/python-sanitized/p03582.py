import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class p03582:
    private static void solve():
        a = na(3)
        list = ArrayList()
        for j in range(3):
            for i in range(a[j]):
                list.add(str(chr(ord('a') + j)))

        while list.size() > 1:
            Collections.sort(list)
            last = list.size() - 1
            s = list.get(0) + list.get(last)
            list.set(0, s)
            list.remove(last)
        print(list.get(0))

    public static void main(String[] args):
        new Thread(null, new Runnable() {
            @Override
            public void run():
                long start = System.currentTimeMillis()
                String debug = System.getProperty("debug")
                if debug != null:
                    try:
                        is = java.nio.file.Files.newInputStream(java.nio.file.Paths.get(debug))
                    catch Exception e:
                        throw new RuntimeException(e)
                reader = new java.io.BufferedReader(new java.io.InputStreamReader(is), 32768)
                solve()
                out.flush()
                tr((System.currentTimeMillis() - start) + "ms")
        }, "", 64000000).start()

    private static java.io.InputStream is = System.in
    private static java.io.PrintWriter out = new java.io.PrintWriter(System.out)
    private static java.util.StringTokenizer tokenizer = null
    private static java.io.BufferedReader reader

    public static String next():
        while tokenizer == null or not tokenizer.hasMoreTokens():
            try:
                tokenizer = new java.util.StringTokenizer(reader.readLine())
            catch Exception e:
                throw new RuntimeException(e)
        return tokenizer.nextToken()

    private static double nd():
        return Double.parseDouble(next())

    private static long nl():
        return Long.parseLong(next())

    private static int[] na(int n):
        a = int[n]
        for i in range(n):
            a[i] = ni()
        return a

    private static char[] ns():
        return next().toCharArray()

    private static long[] nal(int n):
        a = long[n]
        for i in range(n):
            a[i] = nl()
        return a

    private static int[][] ntable(int n, int m):
        table = int[n][m]
        for i in range(n):
            for j in range(m):
                table[i][j] = ni()
        return table

    private static int[][] nlist(int n, int m):
        table = int[m][n]
        for i in range(n):
            for j in range(m):
                table[j][i] = ni()
        return table

    private static int ni():
        return Integer.parseInt(next())

    private static void tr(Object... o):
        if is != System.in:
            System.out.println(java.util.Arrays.deepToString(o))