import sys

a, b = map(int, sys.stdin.readline().split())

def main():
    return a + b if not b % a else b - a

if __name__ == '__main__':
    ans = main()
    print(ans)