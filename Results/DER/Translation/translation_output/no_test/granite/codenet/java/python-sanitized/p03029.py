import sys

def main():
    try:
        A, P = map(int, sys.stdin.readline().split())
        print((P + 3 * A) // 2)
    except:
        print("Exception")

if __name__ == "__main__":
    main()