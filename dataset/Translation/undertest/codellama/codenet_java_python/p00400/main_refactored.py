class main:
    import sys
    
    def main():
        N = int(input())
        r = 0
        if 'A' <= N <= 'Z':
            r = 1
        elif 'a' <= N <= 'z':
            r = 2
        print(r)
    
    if __name__ == '__main__':
        main()