class main:
    import sys
    
    def main():
        input_num = int(sys.stdin.readline())
        ans = 1
        while input_num >= ans*2:
            ans *= 2
        print(ans)
    
    if __name__ == "__main__":
        main()