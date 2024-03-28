import sys

def main():
    # Reads from stdin in Python, splits the input by whitespace, and converts to integers
    n, k = map(int, sys.stdin.readline().split())

    # Outputting the result based on the comparison without the need for a custom scanner
    if n <= k:
        print(1)
    else:
        print(0)

if __name__ == '__main__':
    main()