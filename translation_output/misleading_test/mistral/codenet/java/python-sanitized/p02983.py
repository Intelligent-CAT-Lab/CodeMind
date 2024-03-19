import sys

def fast_reader():
    br = sys.stdin
    st = None

    def next():
        nonlocal st
        while st is None or not st.hasmoreelements():
            try:
                st = br.readline().split()
            except Exception as e:
                e.printStackTrace()
        return st[0]

    def next_int():
        return int(next())

    def next_long():
        return long(next())

    def next_double():
        return float(next())

    def next_line():
        return next()

    return {
        'next': next,
        'next_int': next_int,
        'next_long': next_long,
        'next_double': next_double,
        'next_line': next_line
    }


def solve():
    fast = fast_reader()
    L = fast['next_int']
    R = fast['next_int']

    R -= L
    L %= 2019
    R += L

    res = 2019  # max value

    if R - L > 2019:
        print(0)
        return

    for i in range(L, R+1):
        for j in range(L, i):
            res = min(res, (i*j) % 2019)

    print(res)


if __name__ == '__main__':
    solve()