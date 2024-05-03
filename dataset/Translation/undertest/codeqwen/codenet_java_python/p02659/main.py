def main():
    a = int(input())
    b = float(input())
    bb = int((b * 100) + 0.5)
    ans = (a * bb) // 100
    print(ans)

if __name__ == "__main__":
    main()