import sys

def main():
    n, m = map(int, input().split())
    
    base = n*100 + m*1800
    
    print(base << m)

if __name__ == "__main__":
    main()