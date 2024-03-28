import sys

class p01636:

    def __init__(self):
        self.INF = 1 << 28
        self.EPS = 1e-10

    def run(self):
        a = sys.stdin.readline().strip()
        ans = 0
        for i in range(len(a)):
            head = a[:i]
            tail = a[i:]
            if head == "":
                h = 0
            elif head == "-":
                continue
            else:
                h = int(head)
            if tail == "" or tail[0] == '0':
                t = 0
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

if __name__ == "__main__":
    p01636().run()