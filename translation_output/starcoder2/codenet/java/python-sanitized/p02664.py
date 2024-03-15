import sys

def main():
    c = sys.stdin.readline().strip()
    count = 0
    for i in range(len(c)):
        if c[i] == 'D' or c[i] == '?':
            count += 1
            c = c[:i] + 'D' + c[i+1:]
    print(c)
    print(count)

if __name__ == '__main__':
    main()