class main:
    import sys
    
    def main():
        a = int(sys.stdin.readline())
        b = int(sys.stdin.readline())
        c = int(sys.stdin.readline())
    
        i = (a + b == c)
        j = (a + c == b)
        k = (b + c == a)
    
        if i or j or k:
            print("Yes")
        else:
            print("No")
    
    if __name__ == "__main__":
        main()