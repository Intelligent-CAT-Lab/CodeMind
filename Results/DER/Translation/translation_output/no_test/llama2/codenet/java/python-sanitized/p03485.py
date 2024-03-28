import java.util.Scanner

def main():
    a = int(input())
    b = int(input())
    print(solve(a, b))

def solve(a, b):
    return (a + b + 1) / 2

if __name__ == '__main__':
    main()