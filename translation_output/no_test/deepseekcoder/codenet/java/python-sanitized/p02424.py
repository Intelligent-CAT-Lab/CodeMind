def main():
    a = int(input())
    b = int(input())
    print(to_string(a & b))
    print(to_string(a | b))
    print(to_string(a ^ b))

def to_string(x):
    return bin(x)[2:].zfill(32)

if __name__ == "__main__":
    main()