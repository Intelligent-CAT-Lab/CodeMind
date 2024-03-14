import sys

def main():
    a = int(sys.stdin.readline())
    b = int(sys.stdin.readline())
    c = int(sys.stdin.readline())
    amount = 0
    time = a

    for i in range(2, c + 1):
        amount += b
        time = a * i

    print(amount)

if __name__ == "__main__":
    main()