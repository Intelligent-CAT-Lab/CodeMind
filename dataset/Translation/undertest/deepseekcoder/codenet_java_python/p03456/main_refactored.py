class main:
    import sys
    import math
    
    def main():
        s, t = input().split()
        mah = s + t
        a = int(mah)
        b = math.isqrt(a)
        if b*b == a:
            print("Yes")
        else:
            print("No")
    
    if __name__ == "__main__":
        main()