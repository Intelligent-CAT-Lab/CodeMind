import sys

def main():
    count = [0] * 5
    ans = 0

    for i in range(5):
        x = int(sys.stdin.readline())
        count[i] += x

        if count[i] == 0:
            ans = i

    print(ans + 1)

if __name__ == "__main__":
    main()