import sys

def main():
    left = sum(int(x) for x in input().split())
    right = sum(int(x) for x in input().split())
    if left > right:
        print("Left")
    elif left == right:
        print("Balanced")
    else:
        print("Right")

if __name__ == "__main__":
    main()