import sys

def main():
    input_values = sys.stdin.readline().strip().split()
    w, h, x, y = map(int, input_values)
    ans = float(w * h / 2)
    a = 0
    if x + x == w and y + y == h:
        a = 1
    print("{:.15f} {}".format(ans, a))

if __name__ == "__main__":
    main()