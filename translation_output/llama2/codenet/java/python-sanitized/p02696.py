import java.util

def main():
    a = int(input())
    b = int(input())
    n = int(input())
    if n >= b:
        print(a * (b - 1) / b)
    else:
        print(a * n / b)

if __name__ == '__main__':
    main()