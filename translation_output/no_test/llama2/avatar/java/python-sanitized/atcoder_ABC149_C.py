import sys

def main():
    X = int(sys.stdin.readline())
    prime = X
    mid = prime / 2
    flag = False

    while True:
        for i in range(2, mid + 1):
            if prime % i == 0:
                flag = True
                break
        if not flag:
            break
        flag = False
        prime += 1

    print(prime)

if __name__ == '__main__':
    main()