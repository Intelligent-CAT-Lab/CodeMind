import java.util

def main():
    n = int(input())
    k = int(input())
    if n % k == 0:
        print(0)
    else:
        print(1)

if __name__ == '__main__':
    main()