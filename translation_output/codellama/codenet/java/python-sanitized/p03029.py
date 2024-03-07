import sys

def main():
    try:
        A, P = map(int, sys.stdin.readline().split())
        print((P + 3 * A) // 2)
    except ValueError:
        print("Exception:", sys.exc_info()[0])

if __name__ == "__main__":
    main()