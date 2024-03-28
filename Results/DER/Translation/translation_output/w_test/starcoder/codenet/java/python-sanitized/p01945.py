import sys

def main():
    while True:
        s = sys.stdin.readline().strip()
        if s == '':
            break
        print(s.count('()'))

if __name__ == '__main__':
    main()