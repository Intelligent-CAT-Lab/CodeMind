import sys

def main():
    a, b = map(int, sys.stdin.readline().split())
    
    print(a + b if b % a == 0 else b - a)

if __name__ == "__main__":
    main()