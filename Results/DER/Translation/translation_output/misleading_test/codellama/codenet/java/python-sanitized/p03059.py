import math

def main():
    a, b, c = map(int, input().split())
    amount = 0
    time = a
    for i in range(2, math.ceil(c + 0.5)):
        amount += b
        time = a * i
    print(amount)

if __name__ == "__main__":
    main()