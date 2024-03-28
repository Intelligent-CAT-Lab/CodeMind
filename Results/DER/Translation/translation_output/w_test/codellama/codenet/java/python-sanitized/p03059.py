import math

def main():
    a, b, c = map(int, input().split())
    amount = 0
    time = a
    for i in range(2, int(math.ceil(c / a)) + 1):
        amount += b
        time *= i
    print(amount)

if __name__ == "__main__":
    main()