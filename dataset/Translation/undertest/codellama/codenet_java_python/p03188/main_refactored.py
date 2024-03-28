class main:
    import java.nio.file
    import java.io.BufferedReader
    import java.io.InputStreamReader
    import java.io.PrintWriter
    import java.util.StringTokenizer
    import java.lang.RuntimeException
    
    class p03188:
        def solve():
            k = ni()
    
            if k == 1:
                print(1)
                print(1)
                return
    
            n = (k + 3) // 4 * 2
    
            ret = [[0] * n for _ in range(n)]
            for i in range(n):
                for j in range(n):
                    ret[i][j] = (i % 2 == 0) * n + (i + j) % n
    
            for i in range(n):
                for j in range(n):
                    if ret[i][j] >= k:
                        ret[i][j] = (ret[i][j] - n) % k
    
            print(n)
            for i in range(n):
                for j in range(n):
                    print((ret[i][j] + 1), end=" ")
                print()
    
        def main(args):
            start = System.currentTimeMillis()
            debug = args.length > 0 and args[0] or None
            if debug is not None:
                try:
                    is = java.nio.file.Files.newInputStream(java.nio.file.Paths.get(debug))
                except Exception as e:
                    raise RuntimeException(e)
    
            reader = BufferedReader(InputStreamReader(is), 32768)
            solve()
            out.flush()
            tr((System.currentTimeMillis() - start) + "ms")
    
        def ni():
            while tokenizer is None or not tokenizer.hasMoreTokens():
                try:
                    tokenizer = StringTokenizer(reader.readLine())
                except Exception as e:
                    raise RuntimeException(e)
    
            return int(tokenizer.nextToken())
    
        def tr(o):
            if is != System.in:
                print(java.util.Arrays.deepToString(o))
    
        def next():
            while tokenizer is None or not tokenizer.hasMoreTokens():
                try:
                    tokenizer = StringTokenizer(reader.readLine())
                except Exception as e:
                    raise RuntimeException(e)
    
            return tokenizer.nextToken()
    
        def nd():
            return float(next())
    
        def nl():
            return int(next())
    
        def na(n):
            a = [0] * n
            for i in range(n):
                a[i] = ni()
            return a
    
        def ns():
            return next().toCharArray()
    
        def nal(n):
            a = [0] * n
            for i in range(n):
                a[i] = nl()
            return a
    
        def ntable(n, m):
            table = [[0] * m for _ in range(n)]
            for i in range(n):
                for j in range(m):
                    table[i][j] = ni()
            return table
    
        def nlist(n, m):
            table = [[0] * n for _ in range(m)]
            for i in range(n):