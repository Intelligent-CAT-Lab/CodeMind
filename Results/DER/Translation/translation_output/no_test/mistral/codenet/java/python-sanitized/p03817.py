import sys

def p03817():
    sc = sys.stdin
    out = sys.stdout
    
    x = int(sc.readline())
    
    ans = x // 11 * 2 + x % 11 // 7 + min(x % 11, 1)
    out.write(str(ans))
    out.flush()

if __name__ == "__main__":
    p03817()