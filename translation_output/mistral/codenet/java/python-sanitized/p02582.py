import sys

def main():
    prnt = sys.stdout
    read = sys.stdin

    s = read.readline()
    res = 0
    if s[0] == 'R' and s[1] == 'R' and s[2] == 'R':
        res = 3
    elif s[0] == 'R' and s[1] == 'R':
        res = 2
    elif s[1] == 'R' and s[2] == 'R':
        res = 2
    elif s[0] == 'S' and s[1] == 'S' and s[2] == 'S':
        res = 0
    else:
        res = 1

    prnt.write(str(res))
    prnt.flush()

if __name__ == '__main__':
    main()