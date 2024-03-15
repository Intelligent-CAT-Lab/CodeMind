import sys

def main():
    for i in range(3):
        print(ord(sys.stdin.read(1)) - ord('a') + ord('A'))

if __name__ == '__main__':
    main()