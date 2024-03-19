import sys

class MyScanner:
    def __init__(self):
        self.data = sys.stdin.readline().strip()
        self.index = 0

    def next(self):
        return self.data[self.index] if self.index < len(self.data) else -1

    def next_line(self):
        return self.data

def run():
    sc = MyScanner()

    c = sc.next_line()
    n = len(c)
    s = ''
    for i in range(n):
        if c[i] == 'A' or c[i] == 'Z':
            s += c[i]

    n = len(s)
    t = ''
    for i in range(n):
        if len(t) == 0 or t[-1] != s[i]:
            t += s[i]

    if 0 < len(t) and t[0] == 'Z':
        t = t[1:]

    if 0 < len(t) and t[-1] == 'A':
        t = t[:-1]

    if 0 < len(t):
        print(t)
    else:
        print(-1)

if __name__ == "__main__":
    run()