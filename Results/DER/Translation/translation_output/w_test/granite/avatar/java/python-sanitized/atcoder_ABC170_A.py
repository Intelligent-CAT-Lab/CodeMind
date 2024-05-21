import sys

def main():
    count = [0] * 5
    for i, x in enumerate(map(int, sys.stdin.readline().split())):
        count[i] += x
        if count[i] == 0:
            print(i + 1)
            return

if __name__ == '__main__':
    main()