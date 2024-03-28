def to_string(x):
    return format(x, '032b')  # Using format to create a 32-bit binary representation

if __name__ == "__main__":
    a, b = map(int, input().split())
    print(to_string(a & b))
    print(to_string(a | b))
    print(to_string(a ^ b))