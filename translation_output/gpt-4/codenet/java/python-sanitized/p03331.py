def digit_sum(num):
    r = 0
    while num > 0:
        r += num % 10
        num //= 10
    return r

def main():
    n = int(input())
    ans = n
    for a in range(2, n//2 + 1):
        b = n - a
        sum_of_digits = digit_sum(a) + digit_sum(b)
        ans = min(sum_of_digits, ans)
    print(ans)

if __name__ == "__main__":
    main()