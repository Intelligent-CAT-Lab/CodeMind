def main():
    w = int(input())
    h = int(input())
    x = int(input())
    y = int(input())
    ans = w * h / 2
    a = 0
    if x + x == w and y + y == h:
        a = 1
    print(f"{ans} {a}")

if __name__ == "__main__":
    main()