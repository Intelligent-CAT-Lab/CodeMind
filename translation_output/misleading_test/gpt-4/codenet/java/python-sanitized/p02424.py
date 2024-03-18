def to_string(x):
    return ''.join(str((x >> i) & 1) for i in range(32))[::-1]

def main():
    a, b = map(int, input().split())
    print(to_string(a & b))
    print(to_string(a | b))
    print(to_string(a ^ b))

if __name__ == "__main__":
    main()