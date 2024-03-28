import sys

def main():
    l = sys.stdin.readline()
    st = l.split()
    answer = int(st[0]) // divide by 3
    print(answer)

if __name__ == '__main__':
    main()