import sys

def main():
    num1, num2 = map(int, sys.stdin.readline().split())
    count = num1 // num2
    count += num1 % num2
    print(count)

if __name__ == "__main__":
    main()