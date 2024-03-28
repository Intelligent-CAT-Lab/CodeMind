class main:
    import sys
    
    def main():
        N = int(sys.stdin.readline())
        r = 0
        if 'A' <= chr(N) <= 'Z':
            r = 1
        elif 'a' <= chr(N) <= 'z':
            r = 2
        print(r)
    
    if __name__ == "__main__":
        main()