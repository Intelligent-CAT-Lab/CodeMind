import sys

def main():
    a = sys.stdin.readline().strip()
    marbles = 0
    for i in range(len(a)):
        if a[i] == '1':
            marbles += 1
    print(marbles)

if __name__ == '__main__':
    main()