import sys

def main():
    L, R, d = map(int, sys.stdin.readline().split())
    count = 0
    for i in range(L, R+1):
        if i % d == 0:
            count += 1
    print(count)

if __name__ == "__main__":
    main()