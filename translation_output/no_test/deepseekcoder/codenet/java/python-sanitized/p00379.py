import math

def main():
    a = int(input())
    n = int(input())
    m = int(input())
    max_val = int(math.pow(m, 1 / n))

    ans = 0
    for i in range(1, max_val + 1):
        x = int(math.pow(i, n))
        y = sum(int(digit) for digit in str(x))

        if y + a == i:
            ans += 1

    print(ans)

if __name__ == "__main__":
    main()