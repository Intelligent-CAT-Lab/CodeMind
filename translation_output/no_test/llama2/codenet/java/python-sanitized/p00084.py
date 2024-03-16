import sys

def main():
    while True:
        line = sys.stdin.readline()
        line = line.replace('.', ',')
        line = line.replace(',', ' ')
        tokens = line.split(' ')
        count = 0
        for i in range(len(tokens)):
            n = len(tokens[i])
            if 3 <= n <= 6:
                if count > 0:
                    print(' ', end='')
                print(tokens[i][:n])
                count += 1
        if count > 0:
            print()

if __name__ == '__main__':
    main()