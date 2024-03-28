def main():
    t, s, q = map(int, input().split())
    sum = 0
    while s < t:
        s *= q
        sum += 1
    print(sum)

if __name__ == "__main__":
    main()