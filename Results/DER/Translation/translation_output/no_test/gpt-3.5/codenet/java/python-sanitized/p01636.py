class p01636:

    def __init__(self):
        self.sc = input().strip()
        self.INF = 1 << 28
        self.EPS = 1e-10

    def run(self):
        a = self.sc
        ans = 0
        for i in range(len(a)):
            head = a[:i]
            tail = a[i:]
            if not head:
                h = 0
            elif head == "-":
                continue
            else:
                h = int(head)
            if not tail:
                t = 0
            elif tail[0] == '0':
                continue
            else:
                t = int(tail)
            if t < 0:
                continue
            if h > t:
                continue
            if (h + t) % 2 != 0:
                continue
            if (t - h) % 2 != 0:
                continue
            ans += 1
        print(ans)

p = p01636()
p.run()