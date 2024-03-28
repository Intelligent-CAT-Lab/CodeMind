import sys

def main():
    ans = "ai1333"
    x = int(sys.stdin.readline())
    for i in range(x//100):
        ans += "3"
    print(ans)

if __name__ == "__main__":
    main()