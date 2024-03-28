class main:
    import sys
    
    def main():
        input = int(sys.stdin.readline())
        ans = 1
        while input >= ans*2:
            ans *= 2
        print(ans)
    
    if __name__ == "__main__":
        main()