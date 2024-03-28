class main:
    def main():
        n = int(input())
    
        # Initialize answer to zero
        ans = 0
        
        # 25cent
        ans += n // 25
        n %= 25
        
        # 10cent
        ans += n // 10
        n %= 10
        
        # 5cent
        ans += n // 5
        n %= 5
        
        # 1cent
        ans += n
    
        # Output the result
        print(ans)
        
    if __name__ == "__main__":
        main()