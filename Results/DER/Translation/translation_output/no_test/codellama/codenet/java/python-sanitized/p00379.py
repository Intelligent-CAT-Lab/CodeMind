import math

def main():
    a, n, m = map(int, input().split())
    max_value = int(math.pow(m, 1 / n))
    ans = 0
    for i in range(1, max_value + 1):
        x = int(math.pow(i, n))
        str_x = str(x)
        y = 0
        for j in range(len(str_x)):
            y += int(str_x[j])
        if y + a == i:
            ans += 1
    print(ans)

if __name__ == "__main__":
    main()