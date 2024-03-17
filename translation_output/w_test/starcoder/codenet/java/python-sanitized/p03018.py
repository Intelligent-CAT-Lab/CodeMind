import sys

def min(a, b, c):
    return min(a, min(b, c))

def max(a, b, c):
    return max(a, max(b, c))

def p(element):
    print(element)

def pp(element):
    print(element, end='')

def main():
    str = sys.stdin.readline().strip()
    str = str.replace('BC', 'X')
    a = 0
    ans = 0
    for i in range(len(str)-1, -1, -1):
        c = str[i]
        if c == 'X':
            a += 1
        elif c == 'A':
            ans += a
        else:
            a = 0
    p(ans)

if __name__ == '__main__':
    main()