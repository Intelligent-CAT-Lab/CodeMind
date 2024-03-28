import math

def prime(x):
    if x <= 1:
        return False
    for i in range(2, int(math.sqrt(x)) + 1):
        if x % i == 0:
            return False
    return True

def main():
    x = int(input())
    while not prime(x):
        x += 1
    print(x)

if __name__ == "__main__":
    main()