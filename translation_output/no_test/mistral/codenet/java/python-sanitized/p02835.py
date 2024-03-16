import sys

def main():
    a = int(input())
    b = int(input())
    c = int(input())
    if a + b + c >= 22:
        print("bust")
    else:
        print("win")

if __name__ == "__main__":
    main()