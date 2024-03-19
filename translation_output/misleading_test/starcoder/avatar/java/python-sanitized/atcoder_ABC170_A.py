import sys

def main():
    input = sys.stdin.readline
    N = list(map(int, input().split()))
    count = [0] * 5
    for i in N:
        count[i - 1] += 1
    for i in range(5):
        if count[i] == 0:
            print(i + 1)
            return

if __name__ == '__main__':
    main()