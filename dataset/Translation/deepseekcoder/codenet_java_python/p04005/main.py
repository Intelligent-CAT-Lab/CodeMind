import sys

def main():
    A, B, C = map(int, sys.stdin.readline().split())

    arr = [A, B, C]
    arr.sort()

    if A % 2 == 0 or B % 2 == 0 or C % 2 == 0:
        print(0)
    else:
        print(arr[0] * arr[1])

if __name__ == "__main__":
    main()