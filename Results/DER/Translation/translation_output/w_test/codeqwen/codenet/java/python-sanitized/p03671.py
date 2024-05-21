def main():
    a, b, c = map(int, input().split())
    sum = sorted([a, b, c])
    print(sum[0] + sum[1])

if __name__ == "__main__":
    main()