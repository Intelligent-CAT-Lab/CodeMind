def main():
    L = int(input())
    R = int(input())
    d = int(input())

    Ans = 0
    for i in range(L, R+1):
        if i % d == 0:
            Ans += 1

    print(Ans)

if __name__ == "__main__":
    main()