import sys

def main():
    n = int(input())
    i = 1
    while True:
        if i * n % 360 == 0:
            print(i)
            sys.exit()
        i += 1

if __name__ == '__main__':
    main()