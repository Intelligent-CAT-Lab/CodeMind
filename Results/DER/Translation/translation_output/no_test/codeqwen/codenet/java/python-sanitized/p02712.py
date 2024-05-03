def main():
    S = int(input())
    list_ = [i for i in range(1, S + 1)]
    ans = sum(i for i in list_ if i % 3 != 0 and i % 5 != 0)
    print(ans)

if __name__ == "__main__":
    main()