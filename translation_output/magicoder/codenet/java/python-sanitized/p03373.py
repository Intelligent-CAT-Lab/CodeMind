import sys

class Scanner:
    def __init__(self, inp):
        self.inp = inp

    def next(self):
        return self.inp.readline().strip()

    def nextInt(self):
        return int(self.next())

class Printer:
    def __init__(self, out):
        self.out = out

    def print(self, *args):
        print(*args, file=self.out)

def solve():
    a = sc.nextInt()
    b = sc.nextInt()
    c = sc.nextInt()
    x = sc.nextInt()
    y = sc.nextInt()

    min_val = float('inf')
    for i in range(max(x, y) + 1):
        tmp = a * max(0, x - i) + b * max(0, y - i) + c * i * 2
        min_val = min(min_val, tmp)

    pr.print(min_val)

if __name__ == "__main__":
    sc = Scanner(sys.stdin)
    pr = Printer(sys.stdout)

    solve()