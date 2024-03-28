class main:
    def main():
        N = int(input()) + 1
    
        # æ¡æ°
        s = str(N)
        length = len(s)
        c = int(s[0])
        max = (c - 1) + 9 * (length - 1)
    
        print(max)
    
    if __name__ == "__main__":
        main()