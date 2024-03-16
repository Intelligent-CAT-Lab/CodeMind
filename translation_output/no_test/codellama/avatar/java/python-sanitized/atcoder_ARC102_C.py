import math

def nchoosek(n, k):
    if k < 0 or n < k:
        return 0
    if k == 0 or n == k:
        return 1
    return math.factorial(n) // (math.factorial(k) * math.factorial(n - k))

def main():
    n = int(input("Enter the value of n: "))
    k = int(input("Enter the value of k: "))
    print(nchoosek(n, k))

if __name__ == "__main__":
    main()