import sys

def main():
    a = int(input())
    b = int(input())
    if a <= 0 and 0 <= b:
        print("Zero")
    else:
        print((min(0, b) - min(-1, a)) % 2 == 1 ? "Positive" : "Negative")

if __name__ == "__main__":
    main()