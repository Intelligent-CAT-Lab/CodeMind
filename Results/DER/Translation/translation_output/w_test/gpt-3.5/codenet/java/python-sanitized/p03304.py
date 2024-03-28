import sys

def main():
    n, m, d = map(int, input().split())
    
    s = n if d == 0 else (n - d) * 2
    result = s / n / n * (m - 1)
    
    print("{:.10f}".format(result))

if __name__ == "__main__":
    main()