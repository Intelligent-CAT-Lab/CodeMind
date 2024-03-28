import sys

def main():
    w, h, x, y = map(int, input().split())
    ans = float(w * h) / 2
    a = 0
    if x + x == w and y + y == h:
        a = 1
    print("{:.6f} {}".format(ans, a))

if __name__ == "__main__":
    main()