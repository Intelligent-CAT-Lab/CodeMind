class main:
    import sys
    
    def main():
        sc = sys.stdin
        out = sys.stdout
        input = int(sc.readline())
        ans = 1
        while input >= ans*2:
            ans *= 2
        out.write(str(ans))
        out.flush()
    
    
    if __name__ == "__main__":
        main()