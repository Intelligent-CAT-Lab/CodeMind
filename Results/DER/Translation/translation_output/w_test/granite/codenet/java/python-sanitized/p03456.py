import math

def main():
    s, t = input().split()
    n = int(s + t)
    b = math.sqrt(n)
    if b.is_integer():
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()