class main:
    import sys
    
    def main():
        input_value = int(sys.stdin.readline().strip())
        ans = 1
        while input_value >= ans * 2:
            ans *= 2
        print(ans)
    
    if __name__ == "__main__":
        main()