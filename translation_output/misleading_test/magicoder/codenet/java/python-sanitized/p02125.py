import sys

def run():
    N = int(sys.stdin.readline())
    if N == 1:
        print(1)
        return
    c = 1
    while 2 * c - 1 <= N:
        c *= 2
    c -= 1
    print(bin(c).count('1'))

if __name__ == "__main__":
    run()