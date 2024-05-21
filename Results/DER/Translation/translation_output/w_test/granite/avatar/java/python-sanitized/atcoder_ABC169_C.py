import math

def main():
    a, b = map(int, input().split())
    c = round(b * 100)
    d = a * c
    print(d // 100)

if __name__ == "__main__":
    main()