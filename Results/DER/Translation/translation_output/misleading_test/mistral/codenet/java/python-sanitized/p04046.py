import sys

def solve(h, w, a, b):
    mc = ModComb(200005)
    mc.makeFac()
    res = ModInt(0)
    for i in range(h - a):
        res = res + mc.combFac(b - 1 + i, i) * mc.combFac(w - b - 1 + h - 1 - i, h - 1 - i)
    return res

def main():
    h, w, a, b = map(int, sys.stdin.readline().split())
    res = solve(h, w, a, b)
    print(res)

if __name__ == "__main__":
    main()