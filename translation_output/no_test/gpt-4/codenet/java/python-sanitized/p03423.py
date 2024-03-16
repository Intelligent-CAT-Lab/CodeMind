import sys

def main():
    l = sys.stdin.readline()
    answer = int(int(l.split()[0]) // 3)
    print(answer)

if __name__ == '__main__':
    main()