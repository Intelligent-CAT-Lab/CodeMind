def get_num(a, b):
    reverse_b = 0
    while b > 0:
        reverse_b = reverse_b * 10 + b % 10
        b //= 10
    return a + reverse_b

if __name__ == "__main__":
    a = int(input())
    b = int(input())
    ans = get_num(a, b)
    print(ans)