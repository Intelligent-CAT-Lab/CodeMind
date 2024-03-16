def digit(num):
    r = 0
    while True:
        r += num % 10
        num //= 10
        if num == 0:
            break
    return r

def main():
    n = int(input())
    ans = n
    for a in range(2, n // 2 + 1):
        b = n - a
        sum_ab = digit(a) + digit(b)
        ans = min(sum_ab, ans)
    print(ans)

if __name__ == "__main__":
    main()