import sys

def main():
    s = sys.stdin.readline().strip()
    array = list(s)

    for i in range(0, len(s), 2):
        print(array[i], end='')

if __name__ == "__main__":
    main()