import math

def main():
    while True:
        H, R = map(int, input().split())
        if H < 0 and math.abs(H) == R:
            print(0)
        elif H + R > 0:
            print(1)
        else:
            print(-1)

if __name__ == "__main__":
    main()