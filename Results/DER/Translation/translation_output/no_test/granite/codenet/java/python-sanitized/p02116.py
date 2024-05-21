import sys

def main():
    str = sys.stdin.readline()
    res = int(str)

    for i in range(1):
        han = (res >> i) % 2
        if han == 0:
            res = (res % (1 << i)) + 1
            break
        else:
            continue

    print(res)

if __name__ == '__main__':
    main()