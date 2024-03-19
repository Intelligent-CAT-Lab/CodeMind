import math

def is_square(n):
    return int(math.sqrt(n)) ** 2 == n

def main():
    s = input("Enter the first number: ")
    t = input("Enter the second number: ")
    mah = s + t
    a = int(mah)
    b = int(math.sqrt(a))
    if b ** 2 == a:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()