import sys

def main():
    str = sys.stdin.readline()
    ret = ''
    for i in range(len(str) - 1, -1, -1):
        ret += str[i]
    print(ret)

if __name__ == '__main__':
    main()