def to_string(x):
    sb = []
    for i in range(32):
        sb.append(str(x % 2))
        x //= 2
    return ''.join(sb[::-1])

if __name__ == "__main__":
    a, b = map(int, input().split())
    print(to_string(a & b))
    print(to_string(a | b))
    print(to_string(a ^ b))