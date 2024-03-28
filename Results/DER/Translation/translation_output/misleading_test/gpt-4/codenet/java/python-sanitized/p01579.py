def main():
    s = input()

    n = len(s)
    count = [0 for _ in range(2 * n + 1)]
    now = 0
    for char in s:
        if char == '(':
            now += 1
        else:
            now -= 1
        count[now + n] += 1

    now = 0
    ans = 0
    for char in s:
        if char == '(':
            now += 1
        else:
            now -= 1
        count[now + n] -= 1
        ans += count[now + n]

    print(ans)

if __name__ == "__main__":
    main()