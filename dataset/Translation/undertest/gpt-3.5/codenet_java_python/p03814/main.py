import sys

class Printer:
    def __init__(self, output):
        self.output = output

    def println(self, value):
        self.output.write(str(value) + '\n')

def solve():
    s = input().strip()
    n = len(s)

    from_idx = 0
    to_idx = n - 1
    for i in range(n):
        if s[i] == 'A':
            from_idx = i
            break
    for i in range(n-1, -1, -1):
        if s[i] == 'Z':
            to_idx = i
            break

    pr.println(to_idx - from_idx + 1)

if __name__ == "__main__":
    pr = Printer(sys.stdout)
    solve()