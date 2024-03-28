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


n = int(input())
a = int(input())
b = int(input())

ans = (n / (a + b)) * a + min(a, n % (a + b))

print(ans)