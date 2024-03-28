def to_binary(n):
    return format(n, '032b')

def main():
    a, b = map(int, input().split())
    print(to_binary(a & b))
    print(to_binary(a | b))
    print(to_binary(a ^ b))

if __name__ == "__main__":
    main()