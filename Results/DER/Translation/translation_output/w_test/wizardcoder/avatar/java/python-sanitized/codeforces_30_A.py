import math

def is_power(x, n):
    if x == 0:
        return False
    elif x == 1:
        return True
    elif n == 1:
        return True
    elif n % 2 == 0:
        return is_power(x*x, n//2)
    else:
        return is_power(x*x, n//2) or x == n

def main():
    A, B, N = map(int, input().split())
    for x in range(-1000, 1001):
        if is_power(x, N) and x*A == B:
            print(x)
            return
    print("No solution")

if __name__ == '__main__':
    main()