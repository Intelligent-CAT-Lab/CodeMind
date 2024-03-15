import sys

def main():
    number = int(sys.stdin.readline())
    ans = -1
    mask = 2
    while True:
        s = bin(mask).replace('0b', '')
        zeros = 0
        for c in s:
            if c == '0':
                zeros += 1
        if len(s) - zeros != 1:
            continue
        s = s.replace('0', '4').replace('1', '7')
        ans = int(s)
        break
    print(ans)

if __name__ == '__main__':
    main()