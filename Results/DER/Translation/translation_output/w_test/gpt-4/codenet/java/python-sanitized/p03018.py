class FastScanner:
    def __init__(self):
        import sys
        self.buffer = sys.stdin.buffer

    def next(self):
        return input()

def p(element):
    print(element)

def min(a, b, c):
    return min(a, min(b, c))

def max(a, b, c):
    return max(a, max(b, c))

if __name__ == "__main__":
    sc = FastScanner()
    str = sc.next()
    str = str.replace("BC", "X")
    a = 0
    ans = 0
    for c in reversed(str):
        if c == 'X':
            a += 1
        elif c == 'A':
            ans += a
        else:
            a = 0
    p(ans)