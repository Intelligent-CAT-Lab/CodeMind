import sys
import io

class FastScanner:
    def __init__(self):
        self.stdin = io.BytesIO(sys.stdin.buffer.read())
    
    def next(self):
        return self.stdin.readline().decode().strip()

def p(element):
    print(element)

def pp(element):
    print(element, end="")

def min_of_three(a, b, c):
    return min(min(a, b), c)

def max_of_three(a, b, c):
    return max(max(a, b), c)

if __name__ == "__main__":
    sc = FastScanner()
    str = sc.next()
    str = str.replace("BC", "X")
    a = 0
    ans = 0
    for i in reversed(range(len(str))):
        c = str[i]
        if c == 'X':
            a += 1
        elif c == 'A':
            ans += a
        else:
            a = 0
    p(ans)