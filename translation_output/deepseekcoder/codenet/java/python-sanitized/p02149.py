import sys

def main():
    max = 0
    idx = 0
    for i in range(3):
        x = int(sys.stdin.readline())
        if max < x:
            max = x
            idx = i
    print(chr(ord('A') + idx))

if __name__ == "__main__":
    main()