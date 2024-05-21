def toString(x):
    sb = ""
    for i in range(32):
        sb = str(x % 2) + sb
        x //= 2
    return sb

def main():
    a, b = map(int, input().split())
    print(toString(a & b))
    print(toString(a | b))
    print(toString(a ^ b))

if __name__ == "__main__":
    main()