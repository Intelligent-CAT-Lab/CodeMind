import math

def validpos(x, y, r, c):
    return 0 <= x < r and 0 <= y < c

def bit(x, k):
    return (0 < (x >> k) & 1)

n = int(input())

d = [0] * 1000

lis = []
a, b = 9, 10
for i in range(1, 10):
    lis.append(P(i, -11 + i))
lis.append(P(19, -1))

for i in range(1, 15):
    for w in range(1, 1000):
        x = w * b + a
        y = x
        e = 0
        while x > 0:
            e += x % 10
            x //= 10
        lis.append(P(y, (y / e)))
    b *= 10
    a *= 10
    a += 9

lis.sort(key=lambda x: x.x, reverse=True)

max = 0
for w in range(len(lis)):
    if max < lis[w].x:
        max = lis[w].x
        print(max)
        n -= 1
        if n == 0:
            break

# print(d)

# for w in range(n):
#     print(d[w])

def db(*os):
    print(os)

class P:
    def __init__(self, x, d):
        self.x = x
        self.d = d

    def __lt__(self, p):
        return self.d < p.d

if __name__ == "__main__":
    sc = Reader(System.in)
    out = PrintWriter(System.out)

    n = sc.next_int()

    d = [0] * 1000

    lis = []
    a, b = 9, 10
    for i in range(1, 10):
        lis.append(P(i, -11 + i))
    lis.append(P(19, -1))

    for i in range(1, 15):
        for w in range(1, 1000):
            x = w * b + a
            y = x
            e = 0
            while x > 0:
                e += x % 10
                x //= 10
            lis.append(P(y, (y / e)))
        b *= 10
        a *= 10
        a += 9

    lis.sort(key=lambda x: x.x, reverse=True)

    max = 0
    for w in range(len(lis)):
        if max < lis[w].x:
            max = lis[w].x
            out.print(max)
            n -= 1
            if n == 0:
                break

    out.flush()