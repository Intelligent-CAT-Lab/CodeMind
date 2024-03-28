import sys

def codeforces_92_A(n, k):
    i = 1
    req = 1
    while k - req >= 0:
        if k - req >= 0:
            k = k - req
        else:
            break
        i += 1
        if i % n != 0:
            req = i % n
        else:
            req = n
    return k

if __name__ == "__main__":
    n, k = map(int, sys.stdin.readline().split())
    print(codeforces_92_A(n, k))