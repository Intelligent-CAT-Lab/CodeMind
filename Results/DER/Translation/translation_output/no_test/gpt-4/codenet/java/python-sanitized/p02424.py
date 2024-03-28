def to_string(x):
    return ''.join(str((x >> i) & 1) for i in range(31, -1, -1))

def main():
    a = int(input())
    b = int(input())
    print(to_string(a & b))
    print(to_string(a | b))
    print(to_string(a ^ b))

if __name__ == "__main__":
    main()