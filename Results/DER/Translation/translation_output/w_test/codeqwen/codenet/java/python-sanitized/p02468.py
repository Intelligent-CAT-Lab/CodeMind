import sys

def power(a, e, modP):
    ret = 1
    for _ in range(e):
        ret = (ret * a) % modP
        a = (a * a) % modP
    return ret

def main():
    m, n = map(int, sys.stdin.readline().split())
    print(power(m, n, 1000000007))

if __name__ == "__main__":
    main()