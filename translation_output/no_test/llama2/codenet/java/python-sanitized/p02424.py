import java.util

def main():
    a = int(input())
    b = int(input())
    print(bin(a & b))
    print(bin(a | b))
    print(bin(a ^ b))

def bin(x):
    s = ''
    while x:
        s = str(x % 2) + s
        x = x // 2
    return s[::-1]

if __name__ == '__main__':
    main()