class main:
    import math
    import sys
    
    def main():
        s, t = input().split()
        mah = s + t
        a = int(mah)
        b = int(math.sqrt(a))
        if b * b == a:
            print("Yes")
        else:
            print("No")
    
    if __name__ == "__main__":
        main()