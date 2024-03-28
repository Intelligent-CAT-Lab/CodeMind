class main:
    import sys
    
    def main():
        # Reading from input or using test case from the command line arguments
        if len(sys.argv) > 1:
            input_values = sys.argv[1].split()
            x, y = int(input_values[0]), int(input_values[1])
        else:
            x, y = map(int, input().split())
    
        ans = 0
        i = x
        while i <= y:
            ans += 1
            i *= 2
    
        print(ans)
    
    if __name__ == "__main__":
        main()