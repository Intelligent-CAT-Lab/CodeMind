import sys

def main():
    ans = 0
    count = [0] * 5
    for _ in range(5):
        x = int(sys.stdin.readline())
        count[x - 1] += 1
        if count[x - 1] == 0:
            ans = x
    print(ans + 1)

if __name__ == '__main__':
    main()