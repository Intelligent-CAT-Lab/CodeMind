class main:
    import sys
    
    def main():
        s = sys.stdin.readline().split()
        i1 = int(s[0])
        i2 = int(s[1])
    
        count = i1 // i2 + i1 % i2
        print(count)
    
    if __name__ == "__main__":
        main()