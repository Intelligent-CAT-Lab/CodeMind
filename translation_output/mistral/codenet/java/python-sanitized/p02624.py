import sys

def solve():
    LIMIT = 1000000000
    div = [1] * LIMIT
    for i in range(2, LIMIT):
        for j in range(i, LIMIT, i):
            div[j] += 1

    n = int(input())
    res = 0
    for i in range(1, n+1):
        res += i * div[i]
    print(res)

def shuffle(a):
    n = len(a)
    for i in range(n):
        r = i + int(random.random() * (n - i))
        a[i], a[r] = a[r], a[i]

def outln(o):
    print(o)

def out(o):
    print(o, end='')

def main():
    sys.stdin = sys.stdin = open(0)
    solve()
    sys.exit(0)

if __name__ == '__main__':
    main()

def next_int_arr(n):
    res = [int(input()) for _ in range(n)]
    return res

def next_long_arr(n):
    res = [long(input()) for _ in range(n)]
    return res

def next_token():
    while st == None or not st.hasMoreTokens():
        try:
            st = StringTokenizer(input())
        except Exception as e:
            eof = True
            return None
    return st.nextToken()

def next_string():
    try:
        return input()
    except Exception as e:
        eof = True
        return None

def next_int():
    return int(next_token())

def next_long():
    return long(next_token())

def next_double():
    return float(next_token())

st = None
eof = False