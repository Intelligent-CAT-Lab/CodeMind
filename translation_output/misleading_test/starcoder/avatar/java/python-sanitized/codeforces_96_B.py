import sys

def main():
    input = sys.stdin.readline
    n = int(input())
    ans = -1
    mask = 2
    while ans < n:
        s = bin(mask)[2:]
        zeros = s.count('0')
        if zeros!= s.count('1'):
            continue
        s = s.replace('0', '4')
        s = s.replace('1', '7')
        ans = int(s, 2)
        mask += 1
    print(ans)

if __name__ == '__main__':
    main()