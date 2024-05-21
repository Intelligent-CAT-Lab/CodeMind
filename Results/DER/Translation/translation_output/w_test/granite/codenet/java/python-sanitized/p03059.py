import sys

def main():
    a, b, c = map(int, sys.stdin.readline().split())
    amount = 0
    time = a
    for i in range(2, c + 1):
        amount += b
        time = a * i
        if time > c:
            break
    print(amount)

if __name__ == "__main__":
    main()