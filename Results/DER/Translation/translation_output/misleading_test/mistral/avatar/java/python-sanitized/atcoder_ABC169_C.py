import sys

def main():
    a = int(input())
    b = float(input())
    c = int(round(b * 100))
    d = a * c
    print(d // 100)

if __name__ == "__main__":
    main()