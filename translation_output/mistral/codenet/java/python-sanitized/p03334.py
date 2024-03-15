import java.io
import java.util

def solve():
    n = int(input())
    d1 = int(input())
    d2 = int(input())
    d1s = 0
    d2s = 0
    while (d1 & 3 == 0):
        d1s += 1
        d1 >>= 2
    while (d2 & 3 == 0):
        d2s += 1
        d2 >>= 2
    need = n * n
    for i in range(2 * n):
        for j in range(2 * n):
            if ((d1 & 3) == 1 and (((i >> d1s) ^ (j >> d1s)) & 1) != 0:
                continue
            if ((d1 & 3) == 2 and ((i >> d1s) & 1) != 0:
                continue
            if ((d2 & 3) == 1 and (((i >> d2s) ^ (j >> d2s)) & 1) != 0:
                continue
            if ((d2 & 3) == 2 and ((i >> d2s) & 1) != 0:
                continue
            out.write(str(i) + " " + str(j))
            if (--need == 0:
                return
    raise AssertionError

def scan_int():
    return int(scan_string())

def scan_long():
    return long(scan_string())

def scan_string():
    while (tok == None or not tok.hasMoreTokens()):
        tok = StringTokenizer(in.readLine())
    return tok.nextToken()

in = None
out = None
tok = None

if __name__ == '__main__':
    try:
        in = java.io.BufferedReader(java.io.InputStreamReader(sys.stdin))
        out = java.io.PrintWriter(sys.stdout)
        solve()
        in.close()
        out.close()
    except Exception as e:
        e.printStackTrace()
        sys.exit(1)