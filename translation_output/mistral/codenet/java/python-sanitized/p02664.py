import sys

def main():
    c = input().tochar()
    count = 0
    for i in range(len(c)):
        if c[i] == 'D' or c[i] == '?':
            count += 1
            c[i] = 'D'
        print(c[i], end='')
    print('\n')

if __name__ == '__main__':
    main()