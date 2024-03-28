import sys

def main():
    number = int(sys.stdin.readline())
    mask = 2
    while True:
        s = bin(mask)[2:]
        zeros = s.count('0')
        if zeros!= s.count('1'):
            continue
        s = s.replace('0', '4')
        s = s.replace('1', '7')
        value = int(s, 2)
        if value >= number:
            break
        mask += 1
    print(value)

if __name__ == '__main__':
    main()