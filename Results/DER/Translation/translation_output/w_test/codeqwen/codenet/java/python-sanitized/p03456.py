import math

def main():
    s, t = map(int, input().split())
    mah = str(s) + str(t)
    a = int(mah)
    b = math.sqrt(a)
    if b.is_integer():
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()