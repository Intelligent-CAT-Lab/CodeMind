def main():
    a, b = input().split()
    a = int(a)
    b = float(b)
    bb = int(b * 100 + 0.1)
    ans = (a * bb) // 100
    print(ans)

if __name__ == "__main__":
    main()