def main():
    n, m = map(int, input().split())
    result = []

    if n % 2 == 0:
        result.append(0)
        result.extend([0] * (n // 2 - 1))
        result.extend([m] * (n // 2))
    else:
        result.append(0)
        result.extend([0] * (n // 2))
        result.extend([m] * (n // 2))

    print(' '.join(map(str, result)))


if __name__ == "__main__":
    main()