import sys

def fast_scanner(stream):
    br = sys.stdin
    st = None

    def next():
        while st is None or not st.hasMoreTokens():
            try:
                st = str(br.readline()).split()
            except Exception as e:
                e.printStackTrace()
        return st[0]

    def next_int():
        return int(next())

    def next_long():
        return long(next())

    return next_int, next_long

n, a, b = map(int, input().split())
ans = (n / (a + b)) * a + min(a, n % (a + b))
print(ans)