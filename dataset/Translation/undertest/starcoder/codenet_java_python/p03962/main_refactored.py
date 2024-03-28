class main:
    import sys
    
    def main():
        n = int(sys.stdin.readline())
        cans = set()
        for i in range(n):
            cans.add(int(sys.stdin.readline()))
        print(len(cans))
    
    if __name__ == "__main__":
        main()