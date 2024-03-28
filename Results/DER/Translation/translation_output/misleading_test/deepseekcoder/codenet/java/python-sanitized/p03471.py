import sys

def main():
    X, Y = map(int, sys.stdin.readline().split())

    for i in range(X+1):
        for k in range(X-i+1):
            sum = 10000*i + 5000*k + 1000*(X-i-k)
            if sum == Y:
                return i, k, X-i-k
    return -1, -1, -1

if __name__ == "__main__":
    a, b, c = main()
    print(a, b, c)