import sys

def main():
    a = input()
    b = a.split()
    c = len(a)
    if c == 3:
        str = b[0]
        b[0], b[2] = b[2], b[0]
        b[2], str = str, b[2]
    for i in range(c):
        print(b[i], end='')

if __name__ == '__main__':
    main()