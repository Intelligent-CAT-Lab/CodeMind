def main():
    a = int(input())
    b = int(input())

    ans = (b - 1) // (a - 1)
    if (b - 1) % (a - 1) == 0:
        print(ans)
    else:
        print(ans + 1)

if __name__ == "__main__":
    main()