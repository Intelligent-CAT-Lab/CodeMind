def main():
    n = int(input())
    count = 0
    for i in range(1, 1000):
        if is_happy(i) and i <= n:
            count += 1
    print(count)

def is_happy(num):
    seen = set()
    while num not in seen:
        seen.add(num)
        num = transform(num)
    return num == 1

def transform(num):
    result = 0
    while num > 0:
        digit = num % 10
        if digit == 3 or digit == 5 or digit == 7:
            result = result * 10 + digit
        num //= 10
    return result

if __name__ == "__main__":
    main()